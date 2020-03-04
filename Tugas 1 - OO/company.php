<?php
$company_name = $_POST['company_name'];
$company_form = $_POST['company_form'];
$company_address = $_POST['company_address'];
$position = $_POST['position'];
$no_npwp = $_POST['no_npwp'];
?>
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
       Company Name: <?php echo $company_name?><br>
       Company Form: <?php echo $company_form;?><br>
       Company Address: <?php echo $company_address;?><br>
       Position: <?php echo $position;?><br>
       NPWP: <?php echo $no_npwp;?><br>
    </body>
</html>
