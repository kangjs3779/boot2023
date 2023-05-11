$("#btn1").click(function() {
	const obj ={name:"전대망", age: 88};
	
	$.ajax("/sub37/link1", {
		method: "post",
		contentType: "application/json",
		data: JSON.stringify(obj)
	})
	
})

$("#btn2").click(function() {
	const obj ={
		name:"kang", 
		email:"22@22", 
		score:"50.23", 
		married:true
	};
	
	$.ajax("/sub37/link2", {
		contentType:"application/json",
		method:"post",
		data: JSON.stringify(obj)
	})
})

$("#btn3").click(function() {
	const obj = {
		name:"태웅", 
		hobby: ["독서","농구","음악감상"]}
	$.ajax("/sub37/link3", {
		method:"post",
		contentType:"application/json",
		data:JSON.stringify(obj)
	})
})

$("#btn4").click(function() {
	const obj = {name:"kang", phone:["85851010", "89894646", "84785754"]};
	$.ajax("/sub37/link4", {
		method:"post",
		contentType:"application/json",
		data:JSON.stringify(obj)
	})
})

$("#btn5").click(function() {
	const data = {
		title:"java",
		publisher:"한빛",
		writer: {
			name:"정대만",
			age:44
		}
	};
	
	$.ajax("/sub37/link5", {
		method:"post",
		contentType:"application/json",
		data:JSON.stringify(data)
	})
})

$("#btn6").click(function() {
	const data = {
		city:"seoul", 
		price:"5", 
		etc: {
			name:"kkk",
			email:"KK@KK",
			score:"50.3",
			married:true
		}
	};
	
	$.ajax("/sub37/link6", {
		method:"post",
		contentType:"application/json",
		data:JSON.stringify(data)
	})
})

$("#btn7").click(function() {
	const data = [
		{
			name:"kkk",
			age:90
		},
		{
			name:"bbb",
			age:65
		},
		{
			name:"ddd",
			age:35
		}
	]
	
	$.ajax("/sub37/link7", {
		method:"post",
		contentType:"application/json",
		data: JSON.stringify(data)
	})
})

$("#btn8").click(function() {
	const name = $("#inputName").val();
	const age = $("#inputAge").val();
	
	const data = {
		name: name,
		age: age
	};
	
	$.ajax("/sub37/link1", {
		method:"post",
		contentType:"application/json",
		data: JSON.stringify(data)
	})
});

$("#btn9").click(function() {
	const name2 = $("#name2").val();
	const email2 = $("#email2").val();
	const score2 = $("#score2").val();
	const married2 = $("#married2").val();
	
	const data = {
		name: name2,
		email: email2,
		score: score2,
		married: married2
	};
	
	$.ajax("/sub37/link2", {
		method:"post",
		contentType:"application/json",
		data: JSON.stringify(data)
	})
});
