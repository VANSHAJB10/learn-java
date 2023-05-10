***  Spring Boot Features ***

Web Development
SpringApplication
Application events and listeners
Admin features
Externalized Configuration
Properties Files
YAML Support
Type-safe Configuration
Logging
Security

*** *** *** *** *** *** *** ***


*** calling the application ***

public static void main(String[] args)  
{    
  SpringApplication.run(ClassName.class, args);    
} 

*** *** *** *** *** *** *** ***


*** Application events ***

* It provides the facility to enable admin-related features for the application.
    can be enabled by using-->  'spring.application.admin.enabled property'
* It uses YAML files to externalize configuration so that we can work with the same application in different environments.
