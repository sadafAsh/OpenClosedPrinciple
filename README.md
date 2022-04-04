# OpenClosedPrinciple
        
        Open/Closed Principle represent the "O" of the five SOLID Principle of OOPs.They
are best known as SOLID principles.Open-closed principle states that Software entities(classes,
modules ,function etc) should be open for extension,but closed for modification.
         
         
         In this project,'Square','Circle' are the concrete classes 
which implements the "Shape" interface."Calculation" is a concrete class.Any changes in a code lead to 
some unexpected errors in the future.So it is advisable to apply open-close principle that means 
without making any changes(closed for modification) in the calculation class,we can add(extend) a new object ('Rectangle').


JunitTest:
     
 The  Junit Test is done of all the entities in  "Open Closed Principle" project and test coverage 
is 100% successful in jacoco report.

       
  SONARQUBE :
          In sonarqube,reliability ,security , securityReview and maintainability is A and 
the code coverage is 100%. 


SONARQUBE 

gradle command to publish code to SonarQube

gradlew sonarqube
  -Dsonar.projectKey=OpenClosedPrinciple
  -Dsonar.host.url=http://localhost:9000
  -Dsonar.login=c44a0b168848d59025ca6c1c4fe592d3a75c1a11
