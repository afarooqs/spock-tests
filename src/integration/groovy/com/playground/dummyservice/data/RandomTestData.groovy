package com.playground.dummyservice.data

class RandomTestData extends TestData {
    def random = new Random()
    def iProgramId = TestData.PROGRAM_ID_LIST[random.nextInt(TestData.PROGRAM_ID_LIST.size())]
    def iParentId = TestData.PARENT_ID_LIST[random.nextInt(TestData.PARENT_ID_LIST.size())]
    def iParentType = TestData.PARENT_TYPE_LIST[random.nextInt(TestData.PARENT_TYPE_LIST.size())]
    def iUserAgent = TestData.USER_AGENT
    def iIpAddress = TestData.IP_ADDRESS_LIST[random.nextInt(TestData.IP_ADDRESS_LIST.size())]
    def iCountryCode = TestData.COUNTRY_CODE_LIST[random.nextInt(TestData.COUNTRY_CODE_LIST.size())]
    def iAppName = TestData.APP_NAME_LIST[random.nextInt(TestData.APP_NAME_LIST.size())]
    def iCorrelationId = TestData.CORRELATION_ID_LIST[random.nextInt(TestData.CORRELATION_ID_LIST.size())]
    def iAgentName = TestData.getAGENT_NAME_LIST()[random.nextInt(TestData.AGENT_NAME_LIST.size())]
    def iAgentVersion = TestData.getAGENT_VERSION_LIST()[random.nextInt(TestData.AGENT_VERSION_LIST.size())]
    def iDeviceType = TestData.getDEVICE_TYPE_LIST()[random.nextInt(TestData.DEVICE_TYPE_LIST.size())]
    def iDeviceManufacturer = TestData.getDEVICE_MANUFACTURER_LIST()[random.nextInt(TestData.DEVICE_MANUFACTURER_LIST.size())]
    def iDeviceBrand = TestData.getDEVICE_BRAND_LIST()[random.nextInt(TestData.DEVICE_BRAND_LIST.size())]
    def negativeInteger = TestData.NEGATIVE_INTEGERS_LIST[random.nextInt(TestData.NEGATIVE_INTEGERS_LIST.size())]
    def positiveInteger = TestData.POSITIVE_INTEGERS_LIST[random.nextInt(TestData.POSITIVE_INTEGERS_LIST.size())]
}
