#Autor: Hollmans Royero Mendoza

  @stories
  Feature: Utest,
    As a user, i want to be able to register on the Utest page

  @scenario1
  Scenario Outline: search for register option in Utest
    Given hollmans wants to register in Utest
    When he search for the option to registe and fill the registration form
    | strFirstName   | strLastname   | strEmailAddress   | strMonth   | strDay   | strYear   | strCity   | strPostal   | strPassword   | strConfirmPassword   |
    | <strFirstName> | <strLastname> | <strEmailAddress> | <strMonth> | <strDay> | <strYear> | <strCity> | <strPostal> | <strPassword> | <strConfirmPassword> |
    Then he registers on the page
    | strRegistered   |
    | <strRegistered> |

    Examples:
      | strFirstName   | strLastname   | strEmailAddress        | strMonth   | strDay    | strYear     | strCity   | strPostal   | strPassword       | strConfirmPassword   | strRegistered   |
      | Hollmans       | Royero        | hroyero12343@gmail.com | number:7   | number:22 | number:1996 | Bogota    | 10010101    | Contra123#456     | Contra123#456        | Complete Setup  |