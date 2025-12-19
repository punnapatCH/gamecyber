*** To run game compile and run in terminal

เกมนี้ทำอะไรได้บ้าง? (Key Features)
Market Analysis (หัวใจหลักของเกม):

ในทุกๆ รอบ (Turn) ระบบจะแสดงราคาของสินค้า (เช่น Gold, Oil, หรือ Crypto) ย้อนหลัง 7-10 วันเป็น Array

ผู้เล่นต้องใช้คำสั่งจากไฟล์ ArrayStats เพื่อดูว่าราคาวันนี้ "ถูก" หรือ "แพง" เมื่อเทียบกับค่าเฉลี่ย (Average) หรือค่ากลาง (Median)

Inventory Management:

ผู้เล่นมีเงินจำกัดและช่องเก็บของจำกัด ต้องตัดสินใจว่าจะ "Buy Low" (ช้อนซื้อตอนราคาใกล้ค่า Minimum) และ "Sell High" (ขายตอนราคาใกล้ค่า Maximum)

Event Impacts:

จะมีเหตุการณ์สุ่ม เช่น "Market Crash" หรือ "Bull Run" ซึ่งจะทำให้ข้อมูลใน Array เปลี่ยนไปอย่างรวดเร็ว ผู้เล่นต้องคำนวณใหม่ทันที

Performance Tracking:

เมื่อจบเกม ระบบจะเอาผลกำไรในแต่ละรอบมาใส่ Array แล้วเรียก calculateSum เพื่อดูว่าคุณทำเงินรวมไปได้เท่าไหร่
 
