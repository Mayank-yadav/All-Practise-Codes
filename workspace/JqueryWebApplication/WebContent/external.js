/**
 * 
 */
	var counter=0;
	var emps=[];
	var emp=null;
$(document).ready(function() {
	
    $(".container").hide(0).delay(500).fadeIn(3000);

	$("#addEmployee").click(function(){
		$("#addForm").dialog({
			width:600,
			height:300
			
		});
	});
	/*$("#add").click(function(){
		show= document.getElementById('addFormFields');
		var image=document.getElementById('blah').src;
		var name=show.name.value.toString();
		var contact=show.contact.value.toString();
		var email=show.email.value.toString();
		
		$('.display').append("<div id='"+name+"'><img src='"+image+"'width='100px' height='100px'/><br/>Email :'"+email+"<br/>Contact:'"+contact+"</div>" );
	});*/
	/*$('#addFormFields').submit(function() {
        if($('#addFormFields').valid()) {
            var str = '';
            str += $('#name').val() + 'Hello<br />';
            
            $('.display').append(str);
        }
        return false;
    });*/
	
	
});
var wrapper         = $(".display"); 
$(wrapper).on("click","remove", function(e){
	window.alert("hello "+hello);
	//user click on remove text
    e.preventDefault(); $(this).parent('div').remove(); x--;
});




function display(){
	var show=new Object();

	
	show= document.getElementById('addFormFields');
	
	var image=document.getElementById('blah').src;
	
	var name=show.name.value.toString();
	
	var contact=show.contact.value.toString();
	
	var email=show.email.value.toString();
	
	emp={
		image1 : document.getElementById("blah").src,
		name1:document.getElementById("addFormFields").elements.namedItem("name").value,
		email1:document.getElementById("addFormFields").elements.namedItem("email").value,
		contact1:document.getElementById("addFormFields").elements.namedItem("contact").value,
		id:counter,	
	};
	
	emps.push(emp);
	
	
	
	
	$('.display').append("<div class='dynamic' id='"+counter+"' > <div class='close_box'>X</div><div class='dynamic1'><div id='"+counter+name+"'><div class='row'><div class='col-md-6'><img src='"+image+"'width='100px' height='100px'/></div><div class='col-md-6'>Email :"+email+"<br/>Contact:"+contact+"<br/>Name:"+name+"</div></div></div></div><br/><div>" );
	counter++;

	
}

$(document).on('click','.close_box',function(){
    $(this).parent().remove();
});

$(document).on('click','.dynamic',function(){
	for(var i=0;i<emps.length;i++){
		
	if(emps[i].id == $(this).attr('id')){
		
		$('#demo').replaceWith("" +
				"<div id='demo'><br/>" +
				"<div class='col-md-6'>" +	
				"<img src='"+emps[i].image1+"' style=width:100px;height:100px;/></div><br/>"+
				"<div class='col-md-6'>UserName:&nbsp;" +emps[i].name1+
				"<br/>Email:&nbsp;" +emps[i].email1+
				"<br/>Contact:&nbsp;" +emps[i].contact1+
				"</div></div>");
	}
	}
});




function readURL(input) {
    if (input.files && input.files[0]) {
        var reader = new FileReader();

        reader.onload = function (e) {
            $('#blah')
                .attr('src', e.target.result)
                .width(150)
                .height(100);
        };

        reader.readAsDataURL(input.files[0]);
    }
}
