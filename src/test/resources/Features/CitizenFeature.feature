Feature: Citizen Page Feature

Background: Steps common for Citizen Page
Given User Launch Chrome Browser
When User opens URL "http://192.168.1.20:94/"
#Then User can see Citizen Page

@Smoke
Scenario: User opens Citizen Page successfully
#Given User Launch Chrome Browser
#When user opens URL "http://192.168.1.20:94/"
Then User can see Citizen Page

@Smoke
Scenario: Citizen Page contains all fields
Then User can see plain text of Nagar Palika Rawatsar 
And User can see official login button
And User can see TC App button 
And User can see Home link 
And User can see Services link 
And User can see About Us link 
And User can see Act link 
And User can see Gallery link 
And User can see Contact link   
And User can see Feedback link 
And User can see Quick Access Tiles section
And User can see Access citizen services at section 
And User can see Recent Notices & Tenders section 
And User can see Administrator section 
And User can see Government Programs & Schemes section 
And User can see Zone & Wards section 
And User can see About Us section 
And User can see Gallery of Rawatsar section 
And User can see Get in touch section 
And User can see Quicks Links section 

@Smoke
Scenario: Services Link contains all links 
When User clicks on services link 
Then User can see Search Property link 
And User can see Property Details link
And User can see Pay UD Tax link
And User can see View Payment Details link 
And User can see UDT - Apply Self Assessment link 
And User can see Apply Aapatti link 

