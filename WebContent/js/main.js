/**
 * 입력값 검증 함수
 */
function employeeCheck() {
	// id 입력 검증
	if(document.frm.id.value.length == 0){
		alert("아이디를 입력해주세요.");
		document.frm.id.focus();
		return false;
	}
	// 비밀번호 입력 검증
	if(document.frm.pass.value.length == 0) {
		alert("비밀번호를 입력해주세요.");
		document.frm.pass.focus();
		return false;
	}
	// 이름 입력 검증
	if(document.frm.name.value.length == 0) {
		alert("이름을 입력해주세요.");
		document.frm.name.focus();
		return false;
	}
	// 다 null 이 아님 ==> return true ==> 다음 이벤트인 submit 이벤트로 진행
	return true;
}