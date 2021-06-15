package javaCamp.HRMSProject;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import com.cloudinary.*;
import com.cloudinary.utils.ObjectUtils;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2//swagger ı başlatan anotasyon
public class HrmsProjectApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(HrmsProjectApplication.class, args);
		
		Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap(
				"cloud_name", "dlzwvem1a",
				"api_key", "669315612946826",
				"api_secret", "3j1nibMJ38xL7P_w7XQltDi2Ias"));
		
		File  file = new File("F:\\repos\\hrms\\HRMSProject\\my_image.jpeg");
		Map uploadResult = cloudinary.uploader().upload(file, ObjectUtils.emptyMap());
		
		System.out.println(uploadResult.get("url"));
		
	}
	
	
	@Bean
    public Docket api() { //docket tüm apileri gezip dokumantasyon haline getiriyor
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()                                  
          .apis(RequestHandlerSelectors.basePackage("javaCamp.HRMSProject"))              
          .build();  
        
	}
	
}
