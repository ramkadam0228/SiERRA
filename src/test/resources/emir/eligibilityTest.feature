Feature: Check eligibility of EMIR

  Scenario: Check FX Eligibility
    Given <TAPIOUTFile> is processed in SiERRA
#    When Records are filtered with column "FOREIGN_EXCHANGE"
    When Records are filtered with column
      | BU | PRODUCT_ID_VALUE_1 |
      | 38 | FOREIGN_EXCHANGE   |
      | 32 | COMMODITIES   |
    Then write the records in csv file

