package controllers.regular_exception;

import Exception.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    private static final String ID_VILLA = "SV(VL)-\\d{4}";
    private static final String ID_HOUSE = "SV(HO)-\\d{4}";
    private static final String ID_ROOM = "SV(RO)-\\d{4}";
    private static final String NAME_RG = "^[A-Z][a-z]+(\\s[A-Z][a-z]+)*$";
    private static final String AREA_RG = "^([3][0]\\.\\d+)|([3][1-9]\\.?\\d*)|([4-9]\\d\\.?\\d*)|(\\d{3,}\\.?\\d*)$"; //"^([3][0]\\.\\d+)";
    private static final String COST_RG = "^[1-9].[0-9]\\d*$";
    private static final String AMOUNT_PEOPLE_RG = "\\b(0?[1-9]|1[0-9])\\b";
    private static final String ACCOMPANIED_SERVICES_RG = "^(massage|karaoke|food|car)$";
    private static final String NUMBER_FLOOR_RG = "^[1-9]\\d*$";
    private static final String DATE_OF_BIRTH_RG = "^([0][1-9]|[12][0-9]|[3][01])/([0][1-9]|[1][012])/([2][0][0]([012])|[1][9]\\d{2})$";
    private static final String GENDER_RG = "^(male|female|unknow)$";
    private static final String ID_CARD_RG = "^\\d{9}$";
    private static final String NUMBER_PHONE_RG = "^\\d{10}$";
    private static final String EMAIL_RG = "^\\w{3,}(\\.?\\w+)*@[a-z]{2,7}(.[a-z]{2,5}){1,3}$";
    private static final String CUSTOMER_TYPE_RG = "^(member|sliver|gold|platinum|diamond|Member|Sliver|Gold|Platinum|Diamond)$";


    private static Pattern pattern;
    private static Matcher matcher;

    public static void validateIdVilla(String idVilla) throws IdCardException {
        pattern = Pattern.compile(ID_VILLA);
        matcher = pattern.matcher(idVilla);
        if (!matcher.matches()) {
            throw new IdCardException("ID Villa has a format SVVL-XXXX (X : 0 - 9)");
        }
    }

    public static void validateIdHouse(String idHouse) throws IdCardException {
        pattern = Pattern.compile(ID_HOUSE);
        matcher = pattern.matcher(idHouse);
        if (!matcher.matches()) {
            throw new IdCardException("ID House has a format SVHO-XXXX (X : 0 - 9 ) ");
        }
    }

    public static void validateIdRoom(String idRoom) throws IdCardException {
        pattern = Pattern.compile(ID_ROOM);
        matcher = pattern.matcher(idRoom);
        if (!matcher.matches()) {
            throw new IdCardException("ID Room has a format SVRO-XXXX (X : 0 - 9 ) ");
        }
    }

    public static void validateNameService(String nameService) throws NameException {
        pattern = Pattern.compile(NAME_RG);
        matcher = pattern.matcher(nameService);
        if (!matcher.matches()) {
            throw new NameException("Chữ đầu tiên phải viết hoa ");
        }
    }

    public static void validateAreaService(String areaService) throws AreaServiceException {
        pattern = Pattern.compile(AREA_RG);
        matcher = pattern.matcher(areaService);
        if (!matcher.matches()) {
            throw new AreaServiceException("Diện tích phải lớn hơn 30.0 ");
        }
    }

    public static void validateCostService(String costService) throws CostServicesException {
        pattern = Pattern.compile(COST_RG);
        matcher = pattern.matcher(costService);
        if (!matcher.matches()) {
            throw new CostServicesException("Chi phí " + costService + " không có giá trị!");
        }
    }

    public static void validateAmountPeopleService(String amountPeople) throws NumberFormatException {
        pattern = Pattern.compile(AMOUNT_PEOPLE_RG);
        matcher = pattern.matcher(amountPeople);
        if (!matcher.matches()) {
            throw new NumberFormatException("ít nhất 1 người không được quá 20 người ");
        }
    }

    public static void validateAccompaniedService(String accompaniedService) throws OptionServiceExcetion {
        pattern = Pattern.compile(ACCOMPANIED_SERVICES_RG);
        matcher = pattern.matcher(accompaniedService);
        if (!matcher.matches()) {
            throw new OptionServiceExcetion("value : massage/karaoke/food/drink/car ");
        }
    }

    public static void validateNumberOfFloorService(String numberOfFlpor) throws NumberFormatException {
        pattern = Pattern.compile(NUMBER_FLOOR_RG);
        matcher = pattern.matcher(numberOfFlpor);
        if (!matcher.matches()) {
            throw new NumberFormatException(numberOfFlpor + " Phải lớn hơn 0 ");
        }
    }

    public static void validateDateOfBirth(String dayOfBirth) throws BirthdayException {
        pattern = Pattern.compile(DATE_OF_BIRTH_RG);
        matcher = pattern.matcher(dayOfBirth);
        if (!matcher.matches()) {
            throw new BirthdayException(dayOfBirth + " không đúng định dang (dd/mm/yy) và phải lớn hơn 18 tuổi ");
        }
    }

    public static void validateNameCustomer(String NameCustomer) throws NameException {
        pattern = Pattern.compile(NAME_RG);
        matcher = pattern.matcher(NameCustomer);
        if (!matcher.matches()) {
            throw new NameException("Chữ đầu tiên phải viết hoa");
        }
    }

    public static void validateGender(String gender) throws GenderException {
        pattern = Pattern.compile(GENDER_RG);
        matcher = pattern.matcher(gender);
        if (!matcher.matches()) {
            throw new GenderException("Gender : Male | Female | Unknow | ");
        }
    }

    public static void validateIdCard(String idCard) throws IdCardException {
        pattern = Pattern.compile(ID_CARD_RG);
        matcher = pattern.matcher(idCard);
        if (!matcher.matches()) {
            throw new IdCardException(idCard + " không hợp lệ. ID card có định dạng: XXXXXXXXX (X : 0 - 9)");
        }
    }

    public static void validatePhoneNumber(String phoneNumber) throws PhoneNumberException {
        pattern = Pattern.compile(NUMBER_PHONE_RG);
        matcher = pattern.matcher(phoneNumber);
        if (!matcher.matches()) {
            throw new PhoneNumberException(phoneNumber + "Số điện thoại phải có 10 số");
        }
    }

    public static void validateEmail(String email) throws EmailException {
        pattern = Pattern.compile(EMAIL_RG);
        matcher = pattern.matcher(email);
        if (!matcher.matches()) {
            throw new EmailException("Email " + email + " Bạn nhập không đúng (name@abc.com)");
        }
    }

    public static void validateCustomerType(String customerType) throws CustomerInformationException {
        pattern = Pattern.compile(CUSTOMER_TYPE_RG);
        matcher = pattern.matcher(customerType);
        if (!matcher.matches()) {
            throw new CustomerInformationException(customerType + " Không hợp lệ (member|sliver|gold|platinum|diamond|Member|Sliver|Gold|Platinum|Diamond)");
        }
    }

}
