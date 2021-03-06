class Customer {
    constructor(fullName, identity, dateOfBirth, mail, address, customer, discount, quantity, rentDays, service, typeRoom, totalPayment) {
        this.fullName = fullName;
        this.identity = identity;
        this.dateOfBirth = dateOfBirth;
        this.mail = mail;
        this.address = address;
        this.customer = customer;
        this.discount = discount;
        this.quantity = quantity;
        this.rentDays = rentDays;
        this.service = service;
        this.typeRoom = typeRoom;
        this.totalPayment=totalPayment;
    }
    getName(){
        return this.fullName;
    }
    getIdentity(){
        return this.identity;
    }
    getDateOfBirth(){
        return this.dateOfBirth;
    }
    getMail(){
        return this.mail;
    }
    getAddress() {
        return this.address;
    }
    getCustomer() {
        return this.customer;
    }
    getDiscount(){
        return this.discount;
    }
    getQuantity(){
        return this.quantity;
    }
    getRentDays(){
        return this.rentDays;
    }
    getService(){
        return this.service;
    }
    getTypeRoom() {
        return this.typeRoom;
    }
    getTotalPayment(){
        return  this.totalPayment;
    }

}
let listCustomer = [];
listCustomer.push(new Customer("Huệ", 20443123, "22/3/2001", "hovanhue@gmail.com","quảng nam","Diamond",10,20,3,"vip",10,100));
listCustomer.push(new Customer("Huệ", 12345678, "22/3/2001", "123@gmail.com","quảng nam","Diamond",10,20,3,"vip",10,100));
function displayCustomer2(){
    document.body.innerHTML="";
    let temp ="<table border='1'>";
    temp+="<tr>";
    temp+="<th>FullName</th>";
    temp+="<th >Identity Card</th>";
    temp+="<th >Date Of Birth</th>";
    temp+="<th >Email</th>";
    temp+="<th >Address</th>";
    temp+="<th >Customer</th>";
    temp+="<th >Discount</th>";
    temp+="<th >Quantity Included</th>";
    temp+="<th >Rent Day</th>";
    temp+="<th >Service</th>";
    temp+="<th >Type Room Rent</th>";
    temp+="<th >ToTal Payment</th>";
    temp+="</tr>";
    for(let i= 0;i<listCustomer.length;i++){
        temp+="<tr>";
        temp+="<td>"+listCustomer[i].getName()+"</td>";
        temp+="<td>"+listCustomer[i].getIdentity()+"</td>";
        temp+="<td>"+listCustomer[i].getDateOfBirth()+"</td>";
        temp+="<td>"+listCustomer[i].getMail()+"</td>";
        temp+="<td>"+listCustomer[i].getAddress()+"</td>";
        temp+="<td>"+listCustomer[i].getCustomer()+"</td>";
        temp+="<td>"+listCustomer[i].getDiscount()+"</td>";
        temp+="<td>"+listCustomer[i].getQuantity()+"</td>";
        temp+="<td>"+listCustomer[i].getRentDays()+"</td>";
        temp+="<td>"+listCustomer[i].getService()+"</td>";
        temp+="<td>"+listCustomer[i].getTypeRoom()+"</td>";
        temp+="<td>"+listCustomer[i].getTotalPayment()+"</td>";

        temp+="<td><button onclick='changeCustomer2("+ i +")'>Edit</button></td>";
        temp+="<td><button onclick='deleteCustomer2("+ i +")'>Delete</button></td>";
        temp+="</tr>";
    }
    temp+="</table>";
    temp+="<button onclick='addCustomer2()'>Add Customer</button>";

    document.write(temp);
}

function addCustomer2() {
    document.body.innerHTML="";
    let a="\n" +
        "<form class=\"col-sm-6\" id=\"fom\">\n" +
        "  <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css\" integrity=\"sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2\" crossorigin=\"anonymous\">\n" +
        "    <div class=\"form-group row\">\n" +
        "        <label for=\"fullName\" class=\"col-sm-2 col-form-label\">Full Name</label>\n" +
        "        <div class=\"col-sm\">\n" +
        "            <input type=\"text\" class=\"form-control form-control-lg\" id=\"fullName\">\n" +
        "        </div>\n" +
        "    </div>\n" +
        "\n" +
        "    <div class=\"form-group row\">\n" +
        "        <label for=\"identity\" class=\"col-sm-2 col-form-label\">Identity Card</label>\n" +
        "        <div class=\"col-sm\">\n" +
        "            <input type=\"text\" class=\"form-control\" id=\"identity\">\n" +
        "        </div>\n" +
        "    </div>\n" +
        "\n" +
        "    <div class=\"form-group row\">\n" +
        "        <label for=\"dateOfBirth\" class=\"col-sm-2 col-form-label\">DateOfBirth</label>\n" +
        "        <div class=\"col-sm\">\n" +
        "            <input type=\"text\" class=\"form-control form-control-lg\" id=\"dateOfBirth\">\n" +
        "        </div>\n" +
        "    </div>\n" +
        "    <div class=\"form-group row\">\n" +
        "        <label for=\"mail\" class=\"col-sm-2 col-form-label\">Email</label>\n" +
        "        <div class=\"col-sm-10\">\n" +
        "            <input type=\"email\" class=\"form-control\" id=\"mail\" >\n" +
        "        </div>\n" +
        "    </div>\n" +
        "    <div class=\"form-group row\">\n" +
        "        <label for=\"address\" class=\"col-sm-2 col-form-label\">Address</label>\n" +
        "        <div class=\"col-sm-10\">\n" +
        "            <input type=\"text\" class=\"form-control\" id=\"address\">\n" +
        "        </div>\n" +
        "    </div>\n" +
        "    <div class=\"form-group row\">\n" +
        "        <label for=\"customer\" class=\"col-sm-2 col-form-label\">Customer</label>\n" +
        "        <div class=\"col-sm-10\">\n" +
        "            <select id=\"customer\">\n" +
        "                <option value=\" \"></option>\n" +
        "                <option>Diamond</option>\n" +
        "                <option>Platinum</option>\n" +
        "                <option>Gold</option>\n" +
        "                <option>Silver</option>\n" +
        "                <option>Member</option>\n" +
        "            </select>\n" +
        "        </div>\n" +
        "    </div>\n" +
        "    <div class=\"form-group row\">\n" +
        "        <label for=\"discount\" class=\"col-sm-2 col-form-label\">Discount</label>\n" +
        "        <div>\n" +
        "            <input type=\"number\" class=\"form-control\" id=\"discount\">\n" +
        "        </div>\n" +
        "    </div>\n" +
        "    <div class=\"form-group row\">\n" +
        "        <label for=\"quantity\" class=\"col-sm-2 col-form-label\">Quantity Included</label>\n" +
        "        <div>\n" +
        "            <input type=\"number\" class=\"form-control\" id=\"quantity\">\n" +
        "        </div>\n" +
        "    </div>\n" +
        "    <div class=\"form-group row\">\n" +
        "        <label for=\"rentDays\" class=\"col-sm-2 col-form-label\">RentDays</label>\n" +
        "        <div>\n" +
        "            <input type=\"number\" class=\"form-control\" id=\"rentDays\">\n" +
        "        </div>\n" +
        "    </div>\n" +
        "    <div class=\"form-group row\">\n" +
        "        <label for=\"service\" class=\"col-sm-2 col-form-label\">Service</label>\n" +
        "        <div class=\"col-sm-10\">\n" +
        "            <select id=\"service\">\n" +
        "                <option value=\" \"></option>\n" +
        "                <option>Villa</option>\n" +
        "                <option>House</option>\n" +
        "                <option>Room</option>\n" +
        "            </select>\n" +
        "        </div>\n" +
        "    </div>\n" +
        "    <div class=\"form-group row\">\n" +
        "        <label for=\"typeRoom\" class=\"col-sm-2 col-form-label\">Type Room Rent</label>\n" +
        "        <div class=\"col-sm-10\">\n" +
        "            <select id=\"typeRoom\">\n" +
        "                <option value=\" \"></option>\n" +
        "                <option>Vip</option>\n" +
        "                <option>Business</option>\n" +
        "                <option>Normal</option>\n" +
        "            </select>\n" +
        "        </div>\n" +

        "<button onclick='successAddCustomer2()' style='text-align: center'>Add</button>"+

        "    </div>"+"</form>";
    document.write(a);
}
function successAddCustomer2() {
    let name = document.getElementById("fullName").value;
    let identity = document.getElementById("identity").value;
    let dateOfBirth = document.getElementById("dateOfBirth").value;
    let mail = document.getElementById("mail").value;
    let address = document.getElementById("address").value;
    let customer = document.getElementById("customer").value;
    let discount = document.getElementById("discount").value;
    let quantity = document.getElementById("quantity").value;
    let rentDay = document.getElementById("rentDays").value;
    let service = document.getElementById("service").value;
    let typeRoom = document.getElementById("typeRoom").value;
    let money = 0;
    let cost = 0;
    let check = false;
    name = changeName(name);
    if (!isIdentity(identity)){
        alert("Chứng minh thư "+identity+" không đúng")

    }
    // if (!checkBirthDay(dateOfBirth)){
    //     alert("ngày sinh "+dateOfBirth+" bạn vừa nhập không đúng!");
    // }
    if(!isEmail(mail)){
        alert("email "+mail+" bạn vừa nhập không đúng!");
        document.getElementById("mail").focus();
    }
    address = changeAddress(address);

    if (address.toLowerCase() === "đà nẵng") {
        cost += 20;
    } else if (address.toLowerCase() === "huế") {
        cost += 10;
    } else if (address.toLowerCase() === "quảng nam") {
        cost += 5;
    } else if (address === "") {
        alert("bạn chưa nhập địa chỉ!!")
    }

    if (service === "Villa")
        money = 500;
    else if (service === "House")
        money = 300;
    else if (service === "Room")
        money = 100;
    else {
        alert("bạn chưa chọn loại dịch vụ nào!");
    }

    if (parseInt(rentDay) >= 7) {
        cost += 30;
    } else if (parseInt(rentDay) >= 5 || parseInt(rentDay) < 7) {
        cost += 20;
    } else if (parseInt(rentDay) >= 2 || parseInt(rentDay) <= 4) {
        cost += 10;
    }

    if (customer === "Diamond")
        cost += 15;
    else if (customer === "Platinum")
        cost += 10;
    else if (customer === "Gold")
        cost += 5;
    else if (customer === "Silver")
        cost += 2;

    if(discount <= 0 || discount ===""){
        discount = 1;
    }
    let totalPay = money * parseInt(rentDay) * (1 - discount/100) - cost;

    listCustomer.push(new Customer(name,identity,dateOfBirth,mail,address,customer,discount,quantity,rentDay,service,typeRoom,totalPay));
    displayCustomer2();
}
function isIdentity(numberCMND) {
    let check = false;
    let regex = /^[0-9_-]{8}$/;
    if(regex.test(numberCMND)){
        check = true;
    }
    else check = false;
    return check;
}
function isEmail(string) {
    let check = false;
    let regex = /^[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?$/i;
    while (!check) {
        if (!regex.test(string)) {
            check = false;
        }
        else  check = true;
        return check;
    }
}

// let regex = /^[a-z0-9_-]{3,16}$/; tên ít nhất 3 kí tự, dưới 16 kí tự
// let regex = ^(?=.*[A-Z].*[A-Z])(?=.*[!@#$&*])(?=.*[0-9].*[0-9])(?=.*[a-z].*[a-z].*[a-z]).{8}$; mật khẩu ít nhất 8 kí tự
// ^\+?\d{1,3}?[- .]?\(?(?:\d{2,3})\)?[- .]?\d\d\d[- .]?\d\d\d\d$; sđt
function changeName(inputName) {
    let tempName = "";
    inputName = inputName.trim().toLowerCase();// trim: xóa khoảng cách đầu và cuối
    for (let i = 0; i < inputName.length; i++) {
        if (inputName.charAt(i) === " " && inputName.charAt(i + 1) === " ")
            continue;
        if (i === 0 || inputName.charAt(i - 1) === " ") {
            tempName += inputName.charAt(i).toUpperCase();
            continue;
        }
        tempName += inputName.charAt(i);
    }
    return inputName = tempName;
}

function changeAddress(inputAddress) {
    let tempAddress = "";
    inputAddress = inputAddress.trim().toLowerCase();
    for (let i = 0; i < inputAddress.length; i++) {
        if (inputAddress.charAt(i) === " " && inputAddress.charAt(i + 1) === " ")
            continue;
        if (i === 0 || inputAddress.charAt(i - 1) === " ") {
            tempAddress += inputAddress.charAt(i).toUpperCase();
            continue;
        }
        tempAddress += inputAddress.charAt(i);
    }
    return inputAddress = tempAddress;
}

function checkBirthDay(birthday) {
    let check = false;
    while (!check) {
        if (birthday.charAt(2) === "/" && birthday.charAt(5) === "/") {
            let day2 = birthday.substring(0, 2);
            let month2 = birthday.substring(3, 4);
            let year2 = birthday.substring(6, 10);
            if (!isNaN(day2) && !isNaN(month2) && !isNaN(year2)) {
                day2 = Number.parseFloat(day2);
                month2 = Number.parseFloat(month2);
                year2 = Number.parseFloat(year2);
                check = true;
            }
            if (Number.isInteger(day2) && Number.isInteger(month2) && Number.isInteger(year2)) {
                if (day2 > 32 || day2 < 0 && month2 > 13 || month2 < 0) {
                    alert("Bạn nhập ngày sinh không hợp lệ");
                }
            }
        }
    }
    return check;
}
function changeCustomer2(i) {
    document.body.innerHTML="";
    let a="\n" +
        " <form class=\"col-sm-6\" id=\"fom\">\n " +
        "  <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css\" integrity=\"sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2\" crossorigin=\"anonymous\">\n" +
        "    <div class=\"form-group row\">\n" +
        "        <label for=\"fullName\" class=\"col-sm-2 col-form-label\">Full Name</label>\n" +
        "        <div class=\"col-sm\">\n" +
        "            <input type=\"text\" class=\"form-control form-control-lg\" id=\"fullName1\" value='"+listCustomer[i].getName()+"'>\n" +
        "        </div>\n" +
        "    </div>\n" +
        "\n" +
        "    <div class=\"form-group row\">\n" +
        "        <label for=\"identity\" class=\"col-sm-2 col-form-label\">Identity Card</label>\n" +
        "        <div class=\"col-sm\">\n" +
        "            <input type=\"number\" class=\"form-control\" id=\"identity1\" value='"+listCustomer[i].getIdentity()+"'>\n" +
        "        </div>\n" +
        "    </div>\n" +
        "\n" +
        "    <div class=\"form-group row\">\n" +
        "        <label for=\"dateOfBirth\" class=\"col-sm-2 col-form-label\">DateOfBirth</label>\n" +
        "        <div class=\"col-sm\">\n" +
        "            <input type=\"text\" class=\"form-control form-control-lg\" id=\"dateOfBirth1\" value='"+listCustomer[i].getDateOfBirth()+"'>\n" +
        "        </div>\n" +
        "    </div>\n" +
        "    <div class=\"form-group row\">\n" +
        "        <label for=\"mail\" class=\"col-sm-2 col-form-label\">Email</label>\n" +
        "        <div class=\"col-sm-10\">\n" +
        "            <input type=\"email\" class=\"form-control\" id=\"mail1\" value='"+listCustomer[i].getMail()+"'>\n" +
        "        </div>\n" +
        "    </div>\n" +
        "    <div class=\"form-group row\">\n" +
        "        <label for=\"address\" class=\"col-sm-2 col-form-label\">Address</label>\n" +
        "        <div class=\"col-sm-10\">\n" +
        "            <input type=\"text\" class=\"form-control\" id=\"address1\" value='"+listCustomer[i].getAddress()+"'>\n" +
        "        </div>\n" +
        "    </div>\n" +
        "    <div class=\"form-group row\">\n" +
        "        <label for=\"customer\" class=\"col-sm-2 col-form-label\">Customer</label>\n" +
        "        <div class=\"col-sm-10\">\n" +
        "            <select id=\"customer1\" value='"+listCustomer[i].getCustomer()+"'>\n" +
        "                <option value=\" \"></option>\n" +
        "                <option>Diamond</option>\n" +
        "                <option>Platinum</option>\n" +
        "                <option>Gold</option>\n" +
        "                <option>Silver</option>\n" +
        "                <option>Member</option>\n" +
        "            </select>\n" +
        "        </div>\n" +
        "    </div>\n" +
        "    <div class=\"form-group row\">\n" +
        "        <label for=\"discount\" class=\"col-sm-2 col-form-label\">Discount</label>\n" +
        "        <div>\n" +
        "            <input type=\"number\" class=\"form-control\" id=\"discount1\" value='"+listCustomer[i].getDiscount()+"'>\n" +
        "        </div>\n" +
        "    </div>\n" +
        "    <div class=\"form-group row\">\n" +
        "        <label for=\"quantity\" class=\"col-sm-2 col-form-label\">Quantity Included</label>\n" +
        "        <div>\n" +
        "            <input type=\"number\" class=\"form-control\" id=\"quantity1\" value='"+listCustomer[i].getQuantity()+"'>\n" +
        "        </div>\n" +
        "    </div>\n" +
        "    <div class=\"form-group row\">\n" +
        "        <label for=\"rentDays\" class=\"col-sm-2 col-form-label\">RentDays</label>\n" +
        "        <div>\n" +
        "            <input type=\"number\" class=\"form-control\" id=\"rentDays1\" value='"+listCustomer[i].getRentDays()+"'>\n" +
        "        </div>\n" +
        "    </div>\n" +
        "    <div class=\"form-group row\">\n" +
        "        <label for=\"service\" class=\"col-sm-2 col-form-label\">Service</label>\n" +
        "        <div class=\"col-sm-10\">\n" +
        "            <select id=\"service1\" value='"+listCustomer[i].getService()+"'>\n" +
        "                <option value=\" \"></option>\n" +
        "                <option>Villa</option>\n" +
        "                <option>House</option>\n" +
        "                <option>Room</option>\n" +
        "            </select>\n" +
        "        </div>\n" +
        "    </div>\n" +
        "    <div class=\"form-group row\">\n" +
        "        <label for=\"typeRoom\" class=\"col-sm-2 col-form-label\">Type Room Rent</label>\n" +
        "        <div class=\"col-sm-10\">\n" +
        "            <select id=\"typeRoom1\" value='"+listCustomer[i].getTypeRoom()+"'>\n" +
        "                <option value=\" \"></option>\n" +
        "                <option>Vip</option>\n" +
        "                <option>Business</option>\n" +
        "                <option>Normal</option>\n" +
        "            </select>\n" +
        "        </div>\n" +
        "<button type='button' onclick='successEditCustomer2("+ i +")' style='text-align: center'>Update</button>"+

        "    </div>"+"</form>";

    document.write(a);
}


function successEditCustomer2(index) {
    let name = document.getElementById("fullName1").value;
    let identity = document.getElementById("identity1").value;
    let dateOfBirth = document.getElementById("dateOfBirth1").value;
    let mail = document.getElementById("mail1").value;
    let address = document.getElementById("address1").value;
    let customer = document.getElementById("customer1").value;
    let discount = document.getElementById("discount1").value;
    let quantity = document.getElementById("quantity1").value;
    let rentDay = document.getElementById("rentDays1").value;
    let service = document.getElementById("service1").value;
    let typeRoom = document.getElementById("typeRoom1").value;
    let check = false;

    let money = 0;
    if (service === "Villa")
        money = 500;
    else if (service === "House")
        money = 300;
    else if (service === "Room")
        money = 100;
    else alert("bạn chưa chọn loại dịch vụ nào!");

    let cost=0;
    if(address.toLowerCase()==="đà nẵng"){
        cost+=20;
    }
    else if(address.toLowerCase()==="huế"){
        cost+=10;
    }
    else if(address.toLowerCase()==="quảng nam") {
        cost += 5;
    }
    if(parseInt(rentDay)>=7){
        cost+=30;
    }
    else if(parseInt(rentDay)>=5 || parseInt(rentDay)<7){
        cost+=20;
    }
    else if(parseInt(rentDay)>=2 || parseInt(rentDay)<=4){
        cost+=10;
    }
    if(customer==="Diamond")
        cost+=15;
    else if(customer==="Platinum")
        cost+=10;
    else if(customer==="Gold")
        cost+=5;
    else if(customer==="Silver")
        cost+=2;

    let totalPay = money * parseInt(rentDay) * cost;
    let tempName = "";
    name = name.trim().toLowerCase();
    for (let i = 0; i < name.length; i++) {
        if (name.charAt(i) === " " && name.charAt(i + 1) === " ")
            continue;
        if (i === 0 || name.charAt(i - 1) === " ") {
            tempName += name.charAt(i).toUpperCase();
            continue;
        }
        tempName += name.charAt(i);
    }
    name = tempName;

    if(parseInt(rentDay)<0)
        alert("Bạn nhập số ngày thuê không hợp lệ");
    if(parseInt(quantity)<0)
        alert("Bạn nhập số ngày thuê không hợp lệ");

    let tempAddress ="";
    address = address.trim().toLowerCase();
    for (let i = 0; i < address.length; i++) {
        if (address.charAt(i) === " " && address.charAt(i + 1) === " ")
            continue;
        if (i === 0 || address.charAt(i - 1) === " ") {
            tempAddress += address.charAt(i).toUpperCase();
            continue;
        }
        tempAddress += address.charAt(i);
    }
    address = tempAddress;
    while(!check) {
        if (parseFloat(identity) < 10000000 || parseFloat(identity) > 99999999 || identity === "") {
            alert("Bạn nhập chứng minh thư không hợp lệ!");
            document.getElementById("identity").value.focus();
        }
        else
            check =  true;
    }
    listCustomer[index] = new Customer(name,identity,dateOfBirth,mail,address,customer,discount,quantity,rentDay,service,typeRoom,totalPay);
    displayCustomer2();
}
function deleteCustomer2(i) {
    if(confirm("bạn có muốn xóa "+listCustomer[i].getName()+" này hay không?")) {
        listCustomer.splice(i, 1);
        displayCustomer2();
    }
}
