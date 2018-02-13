package com.softwareag.acceptance.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.softwareag.platform.management.test.acceptance.shared.level1.extended.DatabaseSchemaManagementExtendedTest_213;
import com.softwareag.platform.management.test.acceptance.shared.level1.extended.FixInstallationExtendedTest_212_31;
import com.softwareag.platform.management.test.acceptance.shared.level1.extended.InstanceSupportabilityExtendedTest_214_32;
import com.softwareag.platform.management.test.acceptance.shared.level1.extended.ProductInstallationExtendedTest_211_31;

@RunWith(Suite.class)
@Suite.SuiteClasses({ 
	DatabaseSchemaManagementExtendedTest_213.class,
	FixInstallationExtendedTest_212_31.class,
//	InstanceSupportabilityExtendedTest_214_32.class,
	ProductInstallationExtendedTest_211_31.class,

})
public class AcceptanceExtendedTestSuite {
    // do nothing
}
