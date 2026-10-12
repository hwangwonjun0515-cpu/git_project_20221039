const box = document.getElementById("avatar");

// Let box listen for mouseover
box.addEventListener("mouseover", function () {
  box.style.backgroundImage = "url('avatar-hover.jpg')"; // 마우스 올리면 이미지로 전환
  box.style.backgroundSize = "contain";                  // 사진이 잘리지 않게 전체가 보이도록
  box.style.backgroundRepeat = "no-repeat";
  box.style.backgroundPosition = "center";
  box.style.color = "transparent";                       // 뒤에 있던 글자는 가려줌
});

// Let box listen for mouseout
box.addEventListener("mouseout", function () {
  box.style.backgroundImage = "";                         // 원래 상태로 복구
  box.style.color = "";
});

// 네비게이션 카테고리(메뉴)에 마우스를 올리면 배경 강조
const navLinks = document.querySelectorAll("nav > ul > li > a");

navLinks.forEach(function (link) {
  link.addEventListener("mouseover", function () {
    link.style.backgroundImage = "url('avatar-hover.jpg')";
    link.style.backgroundSize = "contain";               // 사진이 잘리지 않게 전체가 보이도록
    link.style.backgroundRepeat = "no-repeat";
    link.style.backgroundPosition = "center";
    link.style.display = "inline-block";
    link.style.width = "64px";
    link.style.height = "64px";
    link.style.color = "transparent";
  });

  link.addEventListener("mouseout", function () {
    link.style.backgroundImage = "";
    link.style.display = "";
    link.style.width = "";
    link.style.height = "";
    link.style.color = "";
  });
});

// 부카테고리(a, b, c) 클릭 시 선택 표시
const subLinks = document.querySelectorAll(".submenu .sub-link");

subLinks.forEach(function (sub) {
  sub.addEventListener("click", function (e) {
    e.preventDefault();
    subLinks.forEach(function (s) { s.classList.remove("active-sub"); });
    sub.classList.add("active-sub");
  });
});