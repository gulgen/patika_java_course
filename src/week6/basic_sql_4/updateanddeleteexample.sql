--test veritabanınızda employee isimli sütun bilgileri id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım
--Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim
--Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım
UPDATE employee
SET name = 'Gülgen Demir',
	email = 'gulgen@update.com'
WHERE id = 1;

UPDATE employee
SET name = 'Maria Jackson',
	email = 'maria@jakcson.com'
WHERE id = 2;

UPDATE employee
SET birthday = '1905-09-10'
WHERE id = 3;

UPDATE employee
SET name = 'Ali Kuş',
	email = 'ali@kus.com',
	birthday = '1994-09-19'
WHERE id = 50;

UPDATE employee
SET email = 'olypie@hayto.com'
WHERE id = 33;

--Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım
DELETE FROM employee
WHERE name = 'Fredric Popley';

DELETE FROM employee
WHERE email = 'bdattez@nifty.com';

DELETE FROM employee
WHERE id = 41;

DELETE FROM employee
WHERE birthday = '1962-08-04';

DELETE FROM employee
WHERE name = 'Jonas Le Maitre';

SELECT * FROM employee;