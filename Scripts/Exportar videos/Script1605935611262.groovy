import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Windows.startApplicationWithTitle('C:\\Program Files\\Adobe\\Adobe Premiere Pro CC 2019\\Adobe Premiere Pro.exe', '')

while (true) {
    Windows.switchToApplication()

    Windows.click(findWindowsObject('Principal'))

    'Selecionando 3 arquivos\r\n'
    Windows.sendKeys(findWindowsObject('Principal'), Keys.chord(Keys.ARROW_DOWN))

    'Abrindo Menu\r\n'
    Windows.sendKeys(findWindowsObject('Principal'), Keys.chord(Keys.ALT))

    'Nav Menu para "Automatizar para sequência"'
    Windows.sendKeys(findWindowsObject('Principal'), Keys.chord(Keys.ARROW_RIGHT, Keys.ARROW_RIGHT, Keys.ARROW_DOWN))

    Windows.setText(findWindowsObject('Principal'), 'a')

    Windows.sendKeys(findWindowsObject('Principal'), Keys.chord(Keys.ENTER))

    'Abrindo menu\r\n'
    Windows.sendKeys(findWindowsObject('Principal'), Keys.chord(Keys.ALT))

    'Indo para Exportar\r\n'
    Windows.sendKeys(findWindowsObject('Principal'), Keys.chord(Keys.ARROW_DOWN, Keys.ARROW_UP, Keys.ARROW_UP, Keys.ARROW_UP, 
            Keys.ARROW_UP, Keys.ARROW_UP, Keys.ARROW_RIGHT, Keys.ENTER))

    WS.delay(3)

    Windows.sendKeys(findWindowsObject('Janela Exportar'), Keys.chord(Keys.TAB, Keys.TAB, Keys.PAGE_DOWN, Keys.ARROW_UP))

    'Ok no Export\r\n'
    Windows.sendKeys(findWindowsObject('Janela Exportar'), Keys.chord(Keys.ENTER))

    WS.delay(3)

    Windows.switchToApplication()

    Windows.click(findWindowsObject('Principal'))

    'Deletando a ultima pasta\r\n'
    Windows.sendKeys(findWindowsObject('Principal'), Keys.chord(Keys.ARROW_DOWN, Keys.DELETE))

    'Confirmando o delete\r\n'
    Windows.sendKeys(findWindowsObject('Principal'), Keys.chord(Keys.ARROW_LEFT, Keys.ENTER))
}

