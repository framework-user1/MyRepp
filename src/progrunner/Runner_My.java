package progrunner;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class Runner_My {
	
	public static List<XmlClass> myClasses = null;
	
	public static void main(String args[]) {
		 
		TestNG myTestNG = new TestNG();
		XmlSuite mySuite = new XmlSuite();
		
		mySuite.setName("suiteABC");
		
		XmlTest TestA = new XmlTest(mySuite);
		TestA.setName("Test A");
		myClasses = new ArrayList<XmlClass>();
		myClasses.add(new XmlClass("suiteABC.TestA"));
		TestA.setXmlClasses(myClasses);
		
		XmlTest TestB = new XmlTest(mySuite);
		TestB.setName("test B");
		myClasses = new ArrayList<XmlClass>();
		myClasses.add(new XmlClass("suiteABC.TestB"));
		TestB.setXmlClasses(myClasses);
		
		XmlTest TestC = new XmlTest(mySuite);
		TestC.setName("test C");
		myClasses = new ArrayList<XmlClass>();
		myClasses.add(new XmlClass("suiteABC.TestC"));
		TestC.setXmlClasses(myClasses);

		List<XmlTest> myTests = new ArrayList<XmlTest>();
		myTests.add(TestA);
		myTests.add(TestB);
		myTests.add(TestC);
		
		mySuite.setTests(myTests);
		
		List<XmlSuite> mySuites = new ArrayList<XmlSuite>();
		myTestNG.setXmlSuites(mySuites);
		
		myTestNG.run();
	}	 
}
