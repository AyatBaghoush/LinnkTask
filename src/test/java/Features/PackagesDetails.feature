
@PackageDetailFeature
Feature: Show supported package details

  @tag1
  Scenario: Show supported package details
    Given I naviagate to STC TV website
    Then I validate that there are available packages
    |لايت  | 15    | ريال سعودي|
    |الأساسية | 25    | ريال سعودي|
    |بريميوم| 60    | ريال سعودي|

 