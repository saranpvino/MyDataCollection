package week6.day2;

import java.io.IOException;

import org.testng.annotations.Test;

public class LearnDependsOnGroups {
  @Test(groups="regression")
  public void createLead() throws IOException {
	  System.out.println("Create Lead");
	  //throw new IOException();
  }
  @Test(groups="smoke",dependsOnGroups="regression")
  public void editLead() {
	  System.out.println("Edit Lead");
  }
  @Test(groups="regression")
  public void deleteLead() {
	  System.out.println("Delete Lead");
  }
  @Test(groups="smoke",dependsOnGroups="regression")
  public void duplicateLead() {
	  System.out.println("Duplicate Lead");
  }
}
