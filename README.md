Shopify Themes Automation Framework
Project Overview
This automation framework is designed to automate the process of searching for themes on the Shopify Themes Page, accessing their demo stores, and identifying the section IDs within those stores. The framework reads theme names from a CSV file, performs the search, navigates to the demo store, and records the IDs of sections under the main element of the page.
Shopify-Themes-Automation/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── pages/               # Page Object classes for different pages
│   │   │   ├── base/                # Base class (e.g., WebDriver setup, CSV reading)              
│   │
│   ├── test/
│   │   ├── java/
│   │   │   ├── testcases/           # Test classes containing the automation scripts
│   │   │   ├── testdata/            # Theme_names file
├── test-outout/
│   ├── OutPut-Data                  # Section for Themes will be saved in this location
├── pom.xml                          # Maven dependencies and project configuration
└── README.md                        # Project documentation

Prerequisites
Before you begin, ensure you have met the following requirements:
-Java JDK (version 8 or higher)
-Maven (for managing dependencies and building the project)
-Git (for version control)
-A Java IDE (e.g., IntelliJ IDEA, Eclipse) is recommended

Setup Instructions
Clone the repository:
git clone https://github.com/yourusername/shopify-themes-automation.git

Import the project into your IDE:
-Import the project as a Maven project.
Install dependencies:
-mvn clean install

Technologies Used
-Java - Programming language
-Selenium WebDriver - Web automation framework
-TestNG - Testing framework
-Maven - Dependency management and build tool
-Page Object Model (POM) - Design pattern for structuring tests
                   
Contact
If you have any questions or feedback, feel free to contact me at harshalsalunke1996@gmail.com
