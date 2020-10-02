package br.com.pucrs.calculadoranotas.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@Import(BeanValidatorPluginsConfiguration.class)
public class SwaggerConfig {
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
		  .select()
		  .apis(RequestHandlerSelectors.basePackage("br.com.pucrs.calculadoranotas"))
		  .paths(PathSelectors.regex("/avaliacao.*"))
		  .build()
		  .apiInfo(metaInfo());
	}

	private ApiInfo metaInfo() {
		ApiInfo apiInfo = new ApiInfo(
				"Calculadora de Notas API REST",
				"1.0",
				"Terms of Service",
				null, new Contact("Luca Gemelli", "https://www.linkedin.com/in/luca-gemelli-7b98b5167/","luccagemelli@hotmail.com"),
				"Apache Lisence Version 2.9",
				"https://www.apache.org/licesen.html", new ArrayList<VendorExtension>()
				);
		return apiInfo;
	}
}