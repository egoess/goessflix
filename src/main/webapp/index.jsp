<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">

    <title>Goessflix Index</title>
</head>
<body>
<script src="assets/js/jquery-2.2.4.js"></script>
<h3>Hi, I'm an index! woohoo</h3>

<form name="upcSearchForm">
    <label for="upc">Enter a UPC number</label>
    <input type="text" size="50em" id="upc"/>
    <input type="button" id="upc-lookup" class="btn btn-default"/>
    <label for="upc-lookup">Look up UPC</label>


    <div id="upcResult"></div>

</form>
    <script>
        (function ($) {

            $('#upc-lookup').on("click", lookupUPC);

            function lookupUPC() {
                $.get("upc/lookup", {upc:$("#upc").val()},
                        function (response) {
                            $('#upcResult').html(response);
                });
            }

        })(jQuery);
    </script>

</body>
</html>