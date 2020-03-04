<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<?php
$person_name = $_POST['person_name'];
$no_hp = $_POST['no_hp'];
$gender = $_POST['gender'];
$dob = $_POST['dob'];
$address = $_POST['address'];
?>
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
       Nama: <?php echo $person_name?><br>
       No.HP: <?php echo $no_hp;?><br>
       Gender: <?php echo $gender;?><br>
       D.o.B: <?php echo $dob;?><br>
       Address: <?php echo $address;?><br>
    </body>
</html>
