<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>NewQuoteSubmission - Broker Login</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>3</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>37bcf704-d997-4f41-9873-952250dca276</testSuiteGuid>
   <testCaseLink>
      <guid>5589349a-8aa9-4eef-b185-8000032a0cce</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Policy/Login/BrokerLogin - App04</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>ba4f9514-e727-4b6a-ae91-7340c54e5da6</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Policy/NewQuote</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>d06525d4-994a-4d3b-9fcc-8298f557ee63</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/TestData/SmokeTest</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>3e94ea1b-be22-4ea9-9844-387c7e5640fe</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>62e9e085-456c-430e-ad1d-25f2a33a0a97</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Policy/SkipQuickQuote</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>c42d5f42-4cdd-4264-81a0-19dca877abac</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Policy/Applicant</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>714accfb-3626-4ff1-a06d-0388f9eb7ebe</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/TestData/SmokeTest</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>714accfb-3626-4ff1-a06d-0388f9eb7ebe</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>EntityType</value>
         <variableId>717b89d0-1609-48d3-9cf7-fcba321bd5ec</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>714accfb-3626-4ff1-a06d-0388f9eb7ebe</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>EntityName</value>
         <variableId>7a98e92e-8ccd-4d43-bcc9-88e317825bcb</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>714accfb-3626-4ff1-a06d-0388f9eb7ebe</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>ApplicantFName</value>
         <variableId>d2d0f84a-6230-42da-b17c-09143156b8fe</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>714accfb-3626-4ff1-a06d-0388f9eb7ebe</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>ApplicantLName</value>
         <variableId>4fb6fde3-1635-4169-9869-3cc08844418e</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>714accfb-3626-4ff1-a06d-0388f9eb7ebe</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>PrimaryPhone</value>
         <variableId>66a108f5-0b2b-4e5d-afcb-b9b99f245a4e</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>714accfb-3626-4ff1-a06d-0388f9eb7ebe</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>ApplicantAddress1</value>
         <variableId>37e08132-8474-4188-8898-b46bad53373d</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>714accfb-3626-4ff1-a06d-0388f9eb7ebe</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>ApplicantCity</value>
         <variableId>b82f42ff-1b33-4798-a22b-3ad65f368ebc</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>714accfb-3626-4ff1-a06d-0388f9eb7ebe</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>ApplicantZip</value>
         <variableId>8703e158-13de-4801-b801-e51cb8448c50</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>714accfb-3626-4ff1-a06d-0388f9eb7ebe</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>SecondaryEntityType</value>
         <variableId>1b100f39-48ab-4f2d-9b1b-fa89e56cd5f2</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>714accfb-3626-4ff1-a06d-0388f9eb7ebe</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>SecondaryFName</value>
         <variableId>2c7d1c11-2db2-4a71-adfd-2034d3ca5396</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>714accfb-3626-4ff1-a06d-0388f9eb7ebe</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>SecondaryLName</value>
         <variableId>b5dc6080-41d1-40ea-9f94-171ca97e536a</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>bbd395d3-6056-4ccb-b797-34c558f1559a</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Policy/PolicyTerm</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>c86dbf08-bdbf-42c9-935f-5f45bc6f78cb</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>e49b0e87-4fb7-4431-ad64-d740b45ef5cb</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>c91cba3e-4f42-4b29-ba56-24211fba5f5c</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>27902637-9107-4c3b-820f-7e4301d22c94</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Policy/DwellingInformation</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>eacd3299-f994-45a0-b4ec-29613337908f</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Policy/DwellingCoverage</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>2b41ee92-d158-4540-aab9-6c8b7a87af70</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Policy/AdditionalInterest</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>00348d02-a5fb-49ed-9761-adbc32252b8f</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Policy/Underwriting</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>9d12d2c1-27e8-44fb-8c2c-3aef7c451b2a</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Policy/InsuranceHistory</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>175090bd-0fda-47e6-bcec-ba7c7ca1e5d5</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>00b32916-6a97-4f12-8444-1f958916cb1b</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>ba4d5a73-56df-48af-b785-002d831532a6</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>dfa1efa8-551d-4969-8df6-b28bbe3c089e</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>faa34396-191d-45f4-9f11-7a8a643815ae</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>f95fa6a5-1179-4f06-902b-44dda4f8c3e4</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Policy/LossHistory</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>42299c82-ad97-4286-8a4b-912485b56b62</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Policy/Pricing</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>725eeff0-945e-45a8-94f0-8e0ca12a1414</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/TestData/SmokeTest</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>725eeff0-945e-45a8-94f0-8e0ca12a1414</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>totalPremium</value>
         <variableId>06f2044c-fb5a-4f59-b9ad-60d56fd6b4f9</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>725eeff0-945e-45a8-94f0-8e0ca12a1414</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>brokerName</value>
         <variableId>c8b188ea-bf70-4252-be89-13d124c9722d</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>725eeff0-945e-45a8-94f0-8e0ca12a1414</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Remark</value>
         <variableId>08294dd3-1782-4c73-b7f0-b163172c499e</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>c45e79c2-c4ef-4a36-a8f4-dbb3e28f84b9</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>07805019-522b-4b76-a418-3211f42db967</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Policy/Transact</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>62b5b4cd-c664-4856-b86e-80ffa4969bb4</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>f1ee03cc-cae2-45c3-8ce5-de59646c1b3a</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Policy/ApplicantInformation_PolicyApprove</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>62e098c0-9d55-4818-9327-09ae94a15869</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Policy/PolicyTerm_PolicyApprove</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>a57113fa-49a4-4f20-afa9-4eec32b71a43</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Policy/DwellingInformation_PolicyApprove</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>f8776b7f-d706-4b32-8b9a-e740b21a56f1</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Policy/Pricing_PolicyApprove</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>ff04c3e2-d332-424b-b502-2166cb7596d0</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>b74aedaa-c476-48da-92bd-575f07a73ce9</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>baf6d56f-a873-4d37-877d-9dd1a71662b0</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>766b3d58-0ed6-4e26-8c1d-b55def45d4d1</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>8f6024e0-40b4-4868-8557-26aaddbd0636</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Policy/Transact_PolicyApprove</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>d073030d-5365-4c8b-9f2d-518a7ccb0246</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>5327157d-cdf9-4558-8bc2-842211b9f0e7</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>f88f9ce9-e497-4b9e-b1c6-d93022905044</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>0e93bf16-07ef-4777-979c-e82041bd43bf</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>c7a9b2dd-19f2-4409-a3f8-22cfaea6d58a</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
