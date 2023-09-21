INSERT INTO SKUS VALUES ('001', 'โค้ก 330ml', 12.00);
INSERT INTO SKUS VALUES ('002', 'สไปร์ท 330 ml', 12.00);
INSERT INTO SKUS VALUES ('003', 'เลย์คลาสสิค 48g', 20.00);
INSERT INTO SKUS VALUES ('004', 'เลย์คลาสสิคโนริสาหร่าย 48g', 20.00);

INSERT INTO PROMOTIONS VALUES ('P001', 'ลดราคา', 1, '001', 2, -1);
INSERT INTO PROMOTIONS VALUES ('P002', 'ลดราคา', 1, '003', 5, 1);
INSERT INTO PROMOTIONS VALUES ('P003', 'ซ้ือคู่ถูกกว่า', 2, '001', 2, 1);
INSERT INTO PROMOTIONS VALUES ('P003', 'ซ้ือคู่ถูกกว่า', 2, '002', 2, 1);

INSERT INTO PROMOTIONS VALUES ('P004', 'ซ้ือคู่ถูกกว่า', 2, '003', 4, 1);
INSERT INTO PROMOTIONS VALUES ('P004', 'ซ้ือคู่ถูกกว่า', 2, '004', 4, 1);

INSERT INTO PROMOTIONS VALUES ('P005', 'ซ้ือสี่ชิ้นถูกกว่า', 4, '001', 3, 1);
INSERT INTO PROMOTIONS VALUES ('P005', 'ซ้ือสี่ชิ้นถูกกว่า', 4, '002', 3, 1);
INSERT INTO PROMOTIONS VALUES ('P005', 'ซ้ือสี่ชิ้นถูกกว่า', 4, '003', 3, 1);
INSERT INTO PROMOTIONS VALUES ('P005', 'ซ้ือสี่ชิ้นถูกกว่า', 4, '004', 3, 1);
