package ro.dima.validator;

import org.springframework.beans.factory.annotation.Autowired;
import ro.dima.service.UsersDataService;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UniqueEmailValidator implements ConstraintValidator<UniqueEmail, String> {

    @Autowired
    private UsersDataService usersDataService;

    @Override
    public void initialize(UniqueEmail constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return (usersDataService.findByEmail(value).getId() == 0);
    }
}
