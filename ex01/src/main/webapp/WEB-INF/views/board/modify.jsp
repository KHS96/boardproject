<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@include file="../include/header.jsp"%>

<!-- Main content -->
<section class="content">
	<div class="row">
		<!-- left column -->
		<div class="col-md-12">
			<!-- general form elements -->
			<div class="box box-primary">
				<div class="box-header">
					<h3 class="box-title">READ BOARD</h3>
				</div>
				<!-- /.box-header -->

<form role="form" method="post">

	<div class="box-body">

		<div class="form-group">
			<label for="exampleInputEmail1">스타일</label> <input type="text"
				name='' class="form-control" value="${boardVO['스타일']}"
				readonly = "true">
		</div>
		<div class="form-group">
			<label for="exampleInputPassword1">태그가</label>
			<textarea class="form-control" name="태그가" rows="3">${boardVO['태그가']}</textarea>
		</div>
	</div>
	<!-- /.box-body -->
</form>


<div class="box-footer">
	<button type="submit" class="btn btn-primary">SAVE</button>
	<button type="submit" class="btn btn-warning">CANCEL</button>
</div>

<script>
	$(document).ready(function() {

		var formObj = $("form[role='form']");

		console.log(formObj);

		$(".btn-warning").on("click", function() {
			self.location = "/board/listAll";
		});

		$(".btn-primary").on("click", function() {
			formObj.submit();
		});

	});
</script>




			</div>
			<!-- /.box -->
		</div>
		<!--/.col (left) -->

	</div>
	<!-- /.row -->
</section>
<!-- /.content -->
</div>
<!-- /.content-wrapper -->

<%@include file="../include/footer.jsp"%>
