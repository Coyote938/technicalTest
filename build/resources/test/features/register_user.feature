Feature: A user wants register in web site UTest.com
  I an user unregistered want register me in UTest
  need go to register page
  to register me

  Scenario: Register an user correctly
    Given An user want register in UTest.com
    And The user go to register page
    When The user register the personal data
      | firstname | lastname | email             | month    | day | year | language | city     | zip        | country        | computer | version | pclanguage | mobile     | model | password     |  confirmpaswword     |
      | Juan      | Castillo | 123abc@test.com   | February | 24  | 1996 | German   | Mexico   | 122106     | Mexico         | Linux    | Kali    | Russian    | BlackBerry | Q5    | Abc123.*-/   |  Abc123.*-/          |
    Then Verify message of registration satisfactly