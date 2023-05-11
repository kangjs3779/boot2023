$("#button1").click(function() {
	$.ajax("/sub36/link1", {method:"post"});
});

$("#button2").click(function() {
	$.ajax("/sub36/link2", {method:"post"});
});

$("#button3").click(function() {
	$.ajax("/sub36/link3", {
		method:"post", 
		data: "name=손"});
});

$("#button4").click(function() {
	$.ajax("/sub36/link4", {
		method:"post", 
		data: "address=seoul&price=99.99"});
});

$("#button5").click(function() {
	$.ajax("/sub36/link5", {
		method:"post", 
		data: "name=son&score=22.22&email=kang@naver"});
});

$("#button6").click(function() {
	$.ajax("/sub36/link6", {
		method:"post", 
		data: "address=soul&product=pen&price=10.0"});
});

$("#button7").click(function() {
	const obj = {name: "son"}
	
	$.ajax("/sub36/link7", {
		method:"post", 
		// data: '{"name": "son"}',
		data: JSON.stringify(obj),
		contentType: "application/json"
	})
});

$("#button8").click(function() {
	const obj = {address:"seoul", name:"박지성"};
	$.ajax("/sub36/link8", {
		method:"post",
		data: JASON.stringify(obj),
		//data: '{"address": "seoul", "name":"박지성"}',
		contentType: "application/json"
	})
});

$("#button9").click(function() {
	const obj = {age:56, name:"힝행홍", married:true}
	$.ajax("/sub36/link9", {
		method:"post",
		data:JSON.stringify(obj), 
		//data: '{"age": 56, "name":"힝행홍", "married": true}',
		contentType: "application/json"
	})
});

$("#button10").click(function() {
	$.ajax("/sub36/link10", {
		method:"post", 
		data: '{"address": null, "age": 30, "name": "손흥민"}',
		contentType: "application/json"
	})
});

$("#button11").click(function() {
	$.ajax("/sub36/link11", {
		method:"post", 
		data: '{"book":{"title":"java", "price": 300}, "address":"seoul"}',
		contentType: "application/json"
	})
});

$("#button12").click(function() {
	$.ajax("/sub36/link12", {
		method:"post",
		data: '{"food":["pizza", "cake", "coffee"], "store":"피자스쿨"}',
		contentType:"application/json"
		//code copy
	})
})

$("#button13").click(function() {
	$.ajax("/sub36/link13", {
		method:"post",
		data: '["pizza", "coke", "coffee"]',
		contentType:"application/json"
	})
})

$("#button14").click(function() {
	$.ajax("/sub36/link14", {
		method:"post",
		data: '[{"name":"강백호","pos":"파포"},{"name":"서태웅","pos":"스포"}]',
		contentType:"application/json"
	})
})












