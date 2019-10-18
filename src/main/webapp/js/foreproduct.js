//var pid=location.href.substr(location.href.indexOf("=")+1);
pid=3;
var cid=1;
$(function(){
	
	//初始化
	//根据pid查询product表
	$.ajax({
		type:"post",
		url:"getProductByPid/"+pid,
		data:{},
		dataType:"json",
		success:function(msg){
			//$("#cid").val(msg.cid);
			//cid=msg.cid;
			$("#productTitle").html(msg.name);
			$("#productSubTitle").html(msg.subTitle);
			$("#originalPrice").html(msg.originalPrice);
			$("#promotePrice").html(msg.promotePrice);
			$("#stock").html("库存"+msg.stock+"件");
			
			if(msg.pro.length!=0){
				$("#imgInimgAndInfo").prepend("<img  class='bigImg' src='img/chanpin/"+msg.pro[0].id+".jpg'/>");
				for(var i=0;i<msg.pro.length;i++){
					if(msg.pro[i].type=="详情"){
						$($(".productDetailImagesPart")[0]).append("<img  src='img/chanpin/"+msg.pro[i].id+".jpg'/>");

					}else{
						$($(".smallImageDiv")[0]).append("<img  class='smallImage' src='img/chanpin/"+msg.pro[i].id+".jpg' bigImageURL='img/chanpin/"+msg.pro[i].id+".jpg'/>");
					}
				}
			}
		}
	});
	//根据cid查询产品属性
	//根据pid查询产品属性值
	
	$.ajax({
		type:"post",
		url:"getPropertiesById/"+pid+"/"+cid,
		data:{},
		dataType:"json",
		success:function(msg){
			console.log(msg);
			var value;
			for(var i=0;i<msg.length;i++){
				if(msg[i].propertyValue==null){
					value="";
				}else{
					value=msg[i].propertyValue.value;
				}
				$($(".productParamterList")[0]).append("<span>"+msg[i].name+":"+value+"</span>")
			}
			
		}
	});
	
	//鼠标悬停，大图变换
	$(document).on("mouseover",".smallImage",function(){
		src_url=$(this).attr("src");
		$($(".bigImg")[0]).attr("src",src_url);
	})
	
})