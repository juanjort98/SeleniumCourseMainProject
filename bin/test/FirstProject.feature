Feature: Navigation Bar
    To see subpages
    Without Logging in
    I can click the navigation bar

   
    Scenario Outline: I can access the subpages through the navigation bar
        Given I navigate to www.freerangetesters.com
        When  I go to <section> using the nav bar
    
        Examples:
            | section   |
            | Cursos    |
            | Recursos  |
            | Blog      |
            | Mentorías |
            | Udemy     |
    @Course
     Scenario: Courses are presented correctly to potential customers
        Given I navigate to www.freerangetesters.com
        When I go to Cursos using the nav bar
        And  select introduction to testing

    @Plans  @Course
    Scenario: Users can select a plan when signing up
        Given I navigate to www.freerangetesters.com
        When  I select Elegir Plan
        Then  I can validate the options in checkout page
    

    

    
    