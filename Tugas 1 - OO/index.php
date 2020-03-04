<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Form</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="wnameth=device-wnameth, initial-scale=1.0">
        <style>
            input[type=text] {
                padding: 12px 20px;
                margin: 8px 0;
                box-sizing: border-box;
                width: 100%;
            }
            button {
                background-color: #4CAF50;
                border: none;
                color: white;
                padding: 16px 32px;
                text-decoration: none;
                margin: 4px 2px;
                cursor: pointer;
                width: 100%;
            }
            table, th, td{border: 1px solid black;}
            table {width: 100%;}
        </style>
    </head>
    <body>
        <table>
            <th>Form profile</th>
            <th>Form company</th>
            <th>Form caleg</th>
            <tr>
                <td>
                    <form action="profile.php" method="POST">
                        <label for="person_name">Name:</label>
                        <input type="text" name="person_name"><br/>
                        <label for="no_hp">No.HP:</label>
                        <input type="text" name="no_hp"><br/>
                        <label for="gender">Gender:</label>
                        <input type="text" name="gender"><br/>
                        <label for="dob">D.o.B:</label>
                        <input type="text" name="dob"><br/>
                        <label for="address">Address:</label>
                        <input type="text" name="address"><br/>
                        <button type="submit" value="Submit">Submit</button>
                    </form>
                </td>
                <td>
                    <form action="company.php" method="POST">
                        <label for="company_name">Company Name:</label>
                        <input type="text" name="company_name"><br/>
                        <label for="company_form">Company Form:</label>
                        <input type="text" name="company_form"><br/>
                        <label for="company_address">Company Address:</label>
                        <input type="text" name="company_address"><br/>
                        <label for="position">Position:</label>
                        <input type="text" name="position"><br/>
                        <label for="no_npwp">NPWP:</label>
                        <input type="text" name="no_npwp"><br/>
                        <button type="submit" value="Submit">Submit</button>
                    </form>
                </td>
                <td><form action="caleg.php" method="POST">
                        <label for="nama_partai">Partai:</label>
                        <input type="text" name="nama_partai"><br/>
                        <label for="no_urut">No.Urut:</label>
                        <input type="text" name="no_urut"><br/>
                        <label for="dapil">Dapil:</label>
                        <input type="text" name="dapil"><br/>
                        <label for="nama_istri">Istri:</label>
                        <input type="text" name="nama_istri"><br/>
                        <label for="anak_1">Anak ke-1:</label>
                        <input type="text" name="anak_1"><br/>
                        <label for="anak_2">Anak ke-2:</label>
                        <input type="text" name="anak_2"><br/>
                        <label for="anak_3">Anak ke-3:</label>
                        <input type="text" name="anak_3"><br/>
                        <button type="submit" value="Submit">Submit</button>
                    </form></td>
            </tr>
        </table>
    </body>
</html>