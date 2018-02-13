package com.softwareag.acceptance.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.softwareag.platform.management.test.acceptance.shared.level1.FixInstallationTest_212;
import com.softwareag.platform.management.test.acceptance.shared.level1.InstanceTest_214;
import com.softwareag.platform.management.test.acceptance.shared.level1.ProductInstallationTest_211;
import com.softwareag.platform.management.test.acceptance.shared.level1.SecurityTest_4;
import com.softwareag.platform.management.test.acceptance.shared.level1.DatabaseSchemaManagementTest_213;
import com.softwareag.platform.management.test.acceptance.shared.level1.SupportabilityTest_3;
import com.softwareag.platform.management.test.acceptance.shared.level1.LifecycleTest_215;
import com.softwareag.platform.management.test.acceptance.shared.level1.PerformanceSizingTest_5;
import com.softwareag.platform.management.test.acceptance.shared.level1.GlobalizationTest_6;
import com.softwareag.platform.management.test.acceptance.shared.level1.LicensingTest_1;


@RunWith(Suite.class)
@Suite.SuiteClasses({ 
	ProductInstallationTest_211.class,
	FixInstallationTest_212.class,
//	InstanceTest_214.class,
//	DatabaseSchemaManagementTest_213.class,
//	SupportabilityTest_3.class,
//	LifecycleTest_215.class,
//	SecurityTest_4.class,
//	PerformanceSizingTest_5.class,
	//GlobalizationTest_6.class,
	LicensingTest_1.class
})
public class AcceptanceTestSuite {
    // do nothing
}
