 Feature: User can add a product to the cart and checkout and admin can add a new category for the products
 
 
Scenario: User adds a product to the cart and checks out
    Given the user is on the login page
    When the user enters valid login credentials and clicks the login button
    Then the user should be logged in and redirected to the homepage

    Given the user is on the homepage
    When the user searches for a product and selects a product to view
    Then the user should be redirected to the product details page

    Given the user is on the product details page
    When the user selects the quantity and adds the product to the cart
    Then the product should be added to the cart and the user should be redirected to the cart page

    Given the user is on the cart page
    When the user clicks the checkout button
    Then the user should be redirected to the checkout page
    
    
    Scenario: Adding a new category of products
  Given I am logged in as an admin user
  When I click on manage product buttons
  
  And I Fill the deatails
  And I enter the category name as "New Category"
  And I enter a description for the category as "This is a new category"
  And I upload an image for the category
  And I click on the "Save" button
  Then  the new category should be visible on the website
