package PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CitizenPage {
	
WebDriver ldriver;
	
	public CitizenPage(WebDriver rDriver) {
		ldriver=rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	@FindBy(how=How.LINK_TEXT,using="Home")
	WebElement HomeLinkText;
	
	@FindBy(how=How.XPATH,using="//p[normalize-space()='Nagar Palika Rawatsar']")
	WebElement NagarPalikaRawatsarPlainText;
	
	@FindBy(how=How.XPATH,using="//a[@class='login_button_large'][normalize-space()='Official Login']")
	WebElement OfficialLoginBtn;
	
	@FindBy(how=How.XPATH,using="//a[normalize-space()='Tc App']")
	WebElement TCAppBtn;
	
	@FindBy(how=How.LINK_TEXT,using="Services")
	WebElement ServicesLinkText;
	
	@FindBy(how=How.LINK_TEXT,using="About Us")
	WebElement AboutUsLinkText;
	
	@FindBy(how=How.LINK_TEXT,using="Act")
	WebElement ActLinkText;
	
	@FindBy(how=How.LINK_TEXT,using="Gallery")
	WebElement GalleryLinkText;
	
	@FindBy(how=How.LINK_TEXT,using="Contact")
	WebElement ContactLinkText;
	
	@FindBy(how=How.LINK_TEXT,using="Feedback")
	WebElement FeedbackLinkText;
	
	@FindBy(how=How.XPATH,using="//h4[normalize-space()='Quick Access Tiles']")
	WebElement QuickAccessTilesPlainText;
	
	@FindBy(how=How.XPATH,using="//h2[normalize-space()='Access citizen services at']")
	WebElement AccessCitizenServicesAtPlainText;
	
	@FindBy(how=How.XPATH,using="//h4[normalize-space()='Recent Notices & Tenders']")
	WebElement RecentNoticesAndTendersPlainText;
	
	@FindBy(how=How.XPATH,using="//h2[normalize-space()='Administrator']")
	WebElement AdministratorPlainText;
	
	@FindBy(how=How.XPATH,using="//h4[normalize-space()='Government Programs & Schemes']")
	WebElement GovernmentProgramsAndSchemesPlainText;
	
	@FindBy(how=How.XPATH,using="//h2[normalize-space()='Zone & Wards']")
	WebElement ZoneAndWardsPlainText;
	
	@FindBy(how=How.XPATH,using="//h2[normalize-space()='About Us']")
	WebElement AboutUsPlainText;
	
	@FindBy(how=How.XPATH,using="//h2[normalize-space()='Gallery of Rawatsar']")
	WebElement GalleryOfRawatsarPlainText;
	
	@FindBy(how=How.XPATH,using="//h1[normalize-space()='Get in touch']")
	WebElement GetInTouchPlainText;
	
	@FindBy(how=How.XPATH,using="//h1[normalize-space()='Quicks Links']")
	WebElement QuicksLinksPlainText;
	
	@FindBy(how=How.LINK_TEXT,using="Search Property")
	WebElement SearchPropertyLinkText;
	
	@FindBy(how=How.LINK_TEXT,using="Property Details")
	WebElement PropertyDetailsLinkText;
	
	@FindBy(how=How.LINK_TEXT,using="Pay UD Tax")
	WebElement PayUDTaxLinkText;
	
	@FindBy(how=How.LINK_TEXT,using="View Payment Details")
	WebElement ViewPaymentDetailsLinkText;
	
	@FindBy(how=How.LINK_TEXT,using="UDT - Apply Self Assesment")
	WebElement UDTApplySelfAssesmentLinkText;
	
	@FindBy(how=How.LINK_TEXT,using="Apply Aapatti")
	WebElement ApplyAapattiLinkText;
	
	public void scrollToElement(WebDriver driver, WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }
	
	public boolean homeLinkTextDisplayed() {
		return HomeLinkText.isDisplayed();
	}
	
	public boolean nagarPalikaRawatsarPlainTextDisplayed() {
		return NagarPalikaRawatsarPlainText.isDisplayed();
	}
	
	public boolean officialLoginBtnDisplayed() {
		return OfficialLoginBtn.isDisplayed();
	}
	
	public boolean tcAppBtnDisplayed() {
		return TCAppBtn.isDisplayed();
	}
	
	public boolean servicesLinkTextDisplayed() {
		return ServicesLinkText.isDisplayed();
	}
	
	public boolean aboutUsLinkTextDisplayed() {
		return AboutUsLinkText.isDisplayed();
	}
	
	public boolean actLinkTextDisplayed() {
		return ActLinkText.isDisplayed();
	}
	
	public boolean galleryLinkTextDisplayed() {
		return GalleryLinkText.isDisplayed();
	}
	
	public boolean contactLinkTextDisplayed() {
		return ContactLinkText.isDisplayed();
	}
	
	public boolean feedbackLinkTextDisplayed() {
		return FeedbackLinkText.isDisplayed();
	}
		
    public boolean quickAccessTilesSectionDisplayed() {
    	scrollToElement(ldriver, QuickAccessTilesPlainText);
    	return QuickAccessTilesPlainText.isDisplayed();
    }
    
    public boolean accessCitizenServicesAtSectionDisplayed() {
    	scrollToElement(ldriver, AccessCitizenServicesAtPlainText);
    	return AccessCitizenServicesAtPlainText.isDisplayed();
    }
    
    public boolean recentNoticesAndTendersSectionDisplayed() {
    	scrollToElement(ldriver, RecentNoticesAndTendersPlainText);
    	return RecentNoticesAndTendersPlainText.isDisplayed();
    }
    
    public boolean administratorSectionDisplayed() {
    	scrollToElement(ldriver, AdministratorPlainText);
    	return AdministratorPlainText.isDisplayed();
    }
    
    public boolean governmentProgramsAndSchemesSectionDisplayed() {
    	scrollToElement(ldriver, GovernmentProgramsAndSchemesPlainText);
    	return GovernmentProgramsAndSchemesPlainText.isDisplayed();
    }
    
    public boolean zoneAndWardsSectionDisplayed() {
    	scrollToElement(ldriver, ZoneAndWardsPlainText);
    	return ZoneAndWardsPlainText.isDisplayed();
    }
    
    public boolean aboutUsSectionDisplayed() {
    	scrollToElement(ldriver, AboutUsPlainText);
    	return AboutUsPlainText.isDisplayed();
    }
    
    public boolean galleryOfRawatsarSectionDisplayed() {
    	scrollToElement(ldriver, GalleryOfRawatsarPlainText);
    	return GalleryOfRawatsarPlainText.isDisplayed();
    }
    
    public boolean getInTouchSectionDisplayed() {
    	scrollToElement(ldriver, GetInTouchPlainText);
    	return GetInTouchPlainText.isDisplayed();
    }
    
    public boolean quicksLinksSectionDisplayed() {
    	scrollToElement(ldriver, QuicksLinksPlainText);
    	return QuicksLinksPlainText.isDisplayed();
    }
    
    public void clickOnServicesLink() {
    	ServicesLinkText.click();
    }
    
    public boolean searchPropertyLinkDisplayed() {
    	return SearchPropertyLinkText.isDisplayed();
    }
    
    public boolean propertyDetailsLinkDisplayed() {
    	return PropertyDetailsLinkText.isDisplayed();
    }
    
    public boolean payUDTaxLinkDisplayed() {
    	return PayUDTaxLinkText.isDisplayed();
    }
    
    public boolean viewPaymentDetailsLinkDisplayed() {
    	return ViewPaymentDetailsLinkText.isDisplayed();
    }
    
    public boolean UDTApplySelfAssesmentLinkDisplayed() {
    	return UDTApplySelfAssesmentLinkText.isDisplayed();
    }
    
    public boolean applyAapattiLinkDisplayed() {
    	return ApplyAapattiLinkText.isDisplayed();
    }
}
