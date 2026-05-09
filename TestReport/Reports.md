# Automation Test Report
Note: I intentionally did not include code to close the application or quit the browser, so that the added product remains visible in the cart.
## Test Information
1. Test Suite: Assignment.jar (Runnable JAR)
2. Test Scenario: Search for a product and add it to the cart successfully

## Browser: Chrome (via ChromeDriver 131.0.6778.139)
1. Java Version: 1.8.0_202
2. IDE Used for Development: Eclipse
3. Execution Mode: Command line (java -jar Assignment.jar)

## Test Steps Executed
1. Launch ChromeDriver (port 21452)
2. Enter password
3. Click Enter
4. Click on Search Icon
5. Search for product → The Collection Snowboard: Liquid
6. Click on searched product
7. Add product to cart

## Expected Result
1. Product should be successfully searched, selected, and added to the cart.
2. Cart should reflect the added product.

## Actual Result
1. All steps executed without error.
2. Product was added to cart successfully.

## Observations
1. ChromeDriver started and connected correctly.
2. W3C protocol handshake detected (stable WebDriver session).
3. No exceptions or failures during execution.
4. Console logs matched expected workflow.

## Status
1. Result: PASS
2. Defects Found: None
