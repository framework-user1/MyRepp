package suiteABC;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class Runner_My {
	
	public static void main(String args[]) {
		 
		TestNG myTestNG = new TestNG();
		XmlSuite mySuite = new XmlSuite();
		
		mySuite.setName("suiteABC");
		
		XmlTest TestA = new XmlTest(mySuite);
		TestA.setName("Test A");
		List<XmlClass> myClasses = new ArrayList<XmlClass>();
		myClasses.add(new XmlClass("suiteABC.TestA"));
		TestA.setXmlClasses(myClasses);
		
		XmlTest TestB = new XmlTest(mySuite);
		TestB.setName("Test B");
		myClasses = new ArrayList<XmlClass>();
		myClasses.add(new XmlClass("suiteABC.TestB"));
		TestB.setXmlClasses(myClasses);
		
		XmlTest TestC = new XmlTest(mySuite);
		TestC.setName("Test C");
		myClasses = new ArrayList<XmlClass>();
		myClasses.add(new XmlClass("suiteABC.TestC"));
		TestC.setXmlClasses(myClasses);

		List<XmlTest> myTests = new ArrayList<XmlTest>();
		myTests.add(TestA);
		myTests.add(TestB);
		myTests.add(TestC);
		
		mySuite.setTests(myTests);
			
		List<XmlSuite> mySuites = new ArrayList<XmlSuite>();
		mySuites.add(mySuite);
		
		myTestNG.setXmlSuites(mySuites);
		myTestNG.run();
	}	 
}
