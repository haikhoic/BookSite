INSERT INTO car (license_plate, repair_date , customer_name           , catalog          , car_maker)
VALUES          ('29V7-65366' , '2003-11-16', 'Nguyễn Ngọc Minh Trang', 'Bảo dưỡng lần 1', 'Honda'  ),
                ('29V7-52143' , '2021-03-05', 'Nguyễn Văn Khoa'       , 'Bảo dưỡng lần 4', 'Toyota' ),
                ('32V7-52143' , '2021-03-05', 'John Doe'             , 'Bảo dưỡng lần 4', 'Toyota' ),
                ('43V7-52143' , '2021-03-05', 'Jane Doe'             , 'Bảo dưỡng lần 4', 'Toyota' ),
                ('51V7-65366' , '2003-11-16', 'James Smith'           , 'Bảo dưỡng lần 1', 'Honda'  ),
                ('62V7-52143' , '2021-03-05', 'Emily Johnson'         , 'Bảo dưỡng lần 4', 'Toyota' ),
                ('73V7-52143' , '2021-03-05', 'Michael Williams'      , 'Bảo dưỡng lần 4', 'Toyota' ),
                ('84V7-52143' , '2021-03-05', 'Jennifer Brown'        , 'Bảo dưỡng lần 4', 'Toyota' );

INSERT INTO accessory (license_plate, repair_date , name         , price  , status_damaged, repair_status)
VALUES                ('29V7-52143' , '2021-03-05', 'Cần gạt mưa', 999000 , 'Bị gãy'      , 'Thay mới'   ),
                      ('29V7-65366' , '2003-11-16', 'Lọc gió'    , 199000 , 'Bị bụi bẩn'  , 'Làm sạch'   ),
                      ('29V7-65366' , '2003-11-16', 'Lốp xe'     , 2000000, 'Bị thủng'    , 'Thay lốp'   ),
                      ('29V7-65366' , '2003-11-16', 'Bình ắc quy', 1465000, 'Bị hết điện' , 'Sạc điện'   ),
                      ('29V7-65366' , '2003-11-16', 'Đèn xe'     , 369000 , 'Bị vỡ'       , 'Thay đèn'   );
