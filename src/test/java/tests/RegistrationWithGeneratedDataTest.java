package tests;

import checks.RegistrationPageCheckups;
import components.CalendarComponent;
import org.junit.jupiter.api.Tag;
import pageobjects.RegistrationPage;
import utils.Fields;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static io.qameta.allure.Allure.step;

public class RegistrationWithGeneratedDataTest extends BaseTest {

    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationPageCheckups registrationPageCheckups = new RegistrationPageCheckups();
    CalendarComponent calendarComponent = new CalendarComponent();
    Fields fields = new Fields();

    @DisplayName("Тест страницы регистрации с генерируемыми рандомными данными")
    @Tag("remote")
    @Test
    void  userRegistrationTest () {
        step("Открываем страницу Demo.qa", () -> {
            registrationPage.openPage().removeBanner();
        });

        step("Заполняем регистрационную форму", () -> {
            registrationPage
                .setFirstName(fields.userFirstName)
                .setLastName(fields.userLastName)
                .setUserEmail(fields.userEmail)
                .setGender(fields.userGender)
                .setUserMobileNumber(fields.userMobileNumber)
                .setSubject(fields.userSubject)
                .setHobbies(fields.userHobby)
                .setAddress(fields.userAddress)
                .uploadFile(fields.userPhoto)
                .selectState(fields.userState)
                .selectCity(fields.userCity);

            calendarComponent
                    .setBirthDate(fields.userBirthDay, fields.userBirthMonth, fields.userBirthYear);

        registrationPage.submitInformation();
        });

        step("Проверяем заполненную форму регистрации", () -> {
        registrationPageCheckups
                .checkResult("Student Name", fields.userFullName)
                .checkResult("Student Email", fields.userEmail)
                .checkResult("Gender", fields.userGender)
                .checkResult("Mobile", fields.userMobileNumber)
                .checkResult("Date of Birth", fields.userFullBirthday)
                .checkResult("Subjects", fields.userSubject)
                .checkResult("Hobbies", fields.userHobby)
                .checkResult("Picture", fields.userPhoto)
                .checkResult("Address", fields.userAddress)
                .checkResult("State and City", fields.userStateAndCity);
        });
    }
}
