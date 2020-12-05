

class soTietKiem {
    constructor(maSo, loaiTietKiem, tenKhachHang, CMND, ngayMoSo, soTienGui) {
        this.maSo = maSo;
        this.loaiTietKiem = loaiTietKiem;
        this.tenKhachHang = tenKhachHang;
        this.CMND = CMND;
        this.ngayMoSo = ngayMoSo;
        this.soTienGui = soTienGui;
    }
    getMaSo(){
        return this.maSo;
    }
    getLoaiTietKiem(){
        return this.loaiTietKiem;
    }
    getTenKhachHang(){
        return this.tenKhachHang;
    }
    getCMND(){
        return this.CMND;
    }
    getNgayMoSo(){
        return this.ngayMoSo;
    }
    getSoTienGui(){
        return this.soTienGui;
    }
}

let danhSachSKT = [];
danhSachSKT.push(new soTietKiem(1,"Tháng","Nguyễn văn A",12345678,"01/01/2010",10000))
function hienThi() {
    document.body.innerHTML = "";
    let tam = "<table border='1'>";
    tam +="<tr>";
    tam +="<th>Mã Số</th>";
    tam +="<th>Loại Tiết Kiệm</th>";
    tam +="<th>Tên Khách Hàng</th>";
    tam +="<th>Chứng Minh Thư</th>";
    tam +="<th>Ngày Mở Sổ</th>";
    tam +="<th>Số Tiền Gửi</th>";
    tam +="</tr>";
    for(let i = 0; i < danhSachSKT.length; i++){
        tam += "<tr>";
        tam += "<td>"+danhSachSKT[i].getMaSo()+"</td>";
        tam += "<td>"+danhSachSKT[i].getLoaiTietKiem()+"</td>";
        tam += "<td>"+danhSachSKT[i].getTenKhachHang()+"</td>";
        tam += "<td>"+danhSachSKT[i].getCMND()+"</td>";
        tam += "<td>"+danhSachSKT[i].getNgayMoSo()+"</td>";
        tam += "<td>"+danhSachSKT[i].getSoTienGui()+"</td>";
        tam += "<td><button onclick='xoaSoTietKiem("+ i +")'>Xóa</button></td>";
        tam +="</tr>";
    }
    tam += "</table>";
    tam +="<button onclick='themSoTietKiem()'>Thêm người mới</button>";

    document.writeln(tam);
}
function themSoTietKiem() {
    document.body.innerHTML = "";
    let tam = "<table>";
    tam += "<tr>";
    tam += "<td><label>Mã số</label></td>";
    tam += "<td><input type='number' id='maSo'></td>";
    tam += "</tr>";
    tam += "<tr>";
    tam += "<td><label>Loại Tiết Kiệm</label></td>";
    tam += "<td><input type='text' id='loaiTietKiem'></td>";
    tam += "</tr>";
    tam += "<tr>";
    tam += "<td><label>Tên Khách hàng</label></td>";
    tam += "<td><input type='text' id='tenKhachHang'></td>";
    tam += "</tr>";
    tam += "<tr>";
    tam += "<td><label>Chứng Minh Thư</label></td>";
    tam += "<td><input type='number' id='CMND'></td>";
    tam += "</tr>";
    tam += "<tr>";
    tam += "<td><label>Ngày Mở Sổ</label></td>";
    tam += "<td><input type='text' id='ngayMoSo'></td>";
    tam += "</tr>";
    tam += "<tr>";
    tam += "<td><label>Số Tiền Gửi</label></td>";
    tam += "<td><input type='number' id='soTienGui'></td>"
    tam += "</table>";
    tam += "<button onclick='themThanhCong()'>Xong</button>";
    document.writeln(tam);
}
function themThanhCong() {
    let maSo = document.getElementById("maSo").value;
    let loaiTietKiem = document.getElementById("loaiTietKiem").value;
    let tenKhachHang = document.getElementById("tenKhachHang").value;
    let CMND = document.getElementById("CMND").value;
    let ngayMoSo = document.getElementById("ngayMoSo").value;
    let soTienGui = document.getElementById("soTienGui").value;

    let tenTam = "";
    if(!kiemtraCMND(maSo)){
        alert("Bạn nhập mã số không đúng!")
    }
    tenKhachHang = tenKhachHang.trim().toLowerCase();
    for (let i = 0; i < tenKhachHang.length; i++) {
        if (tenKhachHang.charAt(i) === " " && tenKhachHang.charAt(i + 1) === " ")
            continue;
        if (i === 0 || tenKhachHang.charAt(i - 1) === " ") {
            tenKhachHang += tenKhachHang.charAt(i).toUpperCase();
            continue;
        }
        tenTam += tenKhachHang.charAt(i);
    }
    tenKhachHang = tenTam;
    danhSachSKT.push(new soTietKiem(maSo,loaiTietKiem,tenKhachHang,CMND,ngayMoSo,soTienGui));
    hienThi();
}
function kiemtraCMND(number) {
    let a = /^[0-9_-]{8}$/;
    if(a.test(number)){
        return true;
    }
    else{
        return false;
    }
}
function xoaSoTietKiem(vitri){
    if(confirm("Bạn có chắc là xóa tên "+danhSachSKT[vitri].getTenKhachHang()+" hay không?")){
        danhSachSKT.splice(vitri, 1);
        hienThi();
    }
}
