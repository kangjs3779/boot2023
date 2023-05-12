$("#btn1").click(function() {
	$.ajax("/sub38/link1");
})
$("#btn2").click(function() {
	$.ajax("/sub38/link2");
})
$("#btn3").click(function() {
	$.ajax("/sub38/link3");
})

$("#btn4").click(function() {
	$.ajax("/sub38/link4");
})
$("#btn5").click(function() {
	$.ajax("/sub38/link5");
})

$("#btn6").click(function() {
	$.ajax("/sub38/link6");
})

$("#btn7").click(function() {
	$.ajax("/sub38/link7");
})

$("#btn8").click(function() {
	$.ajax("/sub38/link8");
})
$("#btn9").click(function() {
	$.ajax("/sub38/link9");
})
$("#btn10").click(function() {
	$.ajax("/sub38/link10");
})
$("#btn11").click(function() {
	$.ajax("/sub38/link11");
})
$("#btn12").click(function() {
	$.ajax("/sub38/link12");
})
$("#btn13").click(function() {
	$.ajax("/sub38/link13");
})
$("#btn14").click(function() {
	$.ajax("/sub38/link14");
})
$("#btn15").click(function() {
	$.ajax("/sub38/link15");
})
$("#btn16").click(function() {
	$.ajax("/sub38/link16");
})
$("#btn17").click(function() {
	$.ajax("/sub38/link17");
})
$("#btn18").click(function() {
	$.ajax("/sub38/link18");
})
$("#btn19").click(function() {
	$.ajax("/sub38/link19");
})
$("#btn20").click(function() {
	$.ajax("/sub39/link20");
})
$("#btn21").click(function() {
	$.ajax("/sub39/link21");
})
$("#btn22").click(function() {

	const cid = $("#categoryIdInput").val();

	$.ajax("/sub39/link22?cid=" + cid)
		.done(function(data) {
			const list = $("#productList");
			list.empty();
			
			data.forEach(function(product) {
				list.append(`<li>${product.productName}</li>`);
			})
		});
})
