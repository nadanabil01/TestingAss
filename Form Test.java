@Test
public void testaya3() {
        System.setProperty("webdriver.chrome.driver", "resources/windows/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/form");
        //wait = WebDriverWait(driver, 10);
        driver.findElement(By.cssSelector("#first-name")).sendKeys("Nada");
        driver.findElement(By.cssSelector("#last-name")).sendKeys("Nabil");
        driver.findElement(By.cssSelector("#job-title")).sendKeys("Engineer");
        driver.findElement(By.cssSelector("#radio-button-2")).click();
        driver.findElement(By.cssSelector("#checkbox-2")).click();
        driver.findElement(By.cssSelector("#select-menu > option:nth-child(2)")).click();
        driver.findElement(By.cssSelector("body > div > form > div > div:nth-child(15) > a")).click();
        driver.quit();
        }
