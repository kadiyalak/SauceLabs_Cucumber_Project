Feature: succesfully login with valid credentials and shop a shirt

  @Sanity @Regression
  Scenario: succesfully login with valid credentials and shop a shirt
    Given User Launch Browser
    And Opens URL "http://www.saucedemo.com/"
    When User Enters user-name  as "standard_user" and Password as "secret_sauce"
    And Click on Login button
    And click on the alert
    And Click on  dropdown
   # And select the Name(A to Z)
   # And select the price(low to high)
   # And select the sauce labs onesie
    And add to cart
    #And select the sauce labs  bike light
    #And add to cart
    And click on the addcart symbol
    And remove product from the cart
    And check checkout functionality
    And user Enters First-name as "Karan" and last-name as "Dubey" and Zip/Postal Code as "55305"
    And Click on continue
    And Click on finish
