//var cid=location.href.substr(location.href.indexOf("=")+1);
$(function(){
	//页面初始化
	//根据cid,和排序方式sort获得产品信息
	cid=1;
	$.ajax({
		type:"get",
		url:"getAllProductsByCid/"+cid,
		data:{},
		dataType:"json",
		success:function(msg){
			console.log(msg);
			for(var i=0;i<msg.length;++i){
				if(msg[i].pro.length!=0){
					var pimgid=msg[i].pro[0].id;
				}else{
					var pimgid=0;
				}
				
				$("#div1_1").append("<div class='productUnit' price='"+msg[i].promotePrice+"'>"+
					"<div class='productUnitFrame'>"+
						"<a href='foreproduct?pid="+msg[i].id+"'> <img class='productImage' src='img/chanpin/"+pimgid+".jpg'>"+
						"</a> <span class='productPrice'>"+msg[i].promotePrice+"</span> <a"+
							"'class='productLink' href='foreproduct?pid="+msg[i].id+"'>"+
							""+msg[i].name+" </a> <a class='tmallLink'"+
							"href='foreproduct?pid="+msg[i].id+"'>天猫专卖</a>"+
						"<div class='show1 productInfo'>"+
							"<span class='monthDeal'>月成交 <span"+
								"class='productDealNumber'>58笔</span></span> <span class='productReview'>评价<span"+
								"class='productReviewNumber'>20</span></span> <span class='wangwang'>"+
								"<a class='wangwanglink' href='#nowhere'> <img"+
									"src='img/site/wangwang.png'></a></span></div></div>")
			}
			
		}
	})
	
	
})