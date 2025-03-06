# پروژه شبیه ساز اپلیکشین تجاری

در این پروژه یک interface برای روش های پرداخت و سه کلاس برای انواع روش های پرداخت ساخته شده است.
یک کلاس ابسترکت به نام Customer ساخته و دو کلاس RegularCustomer و RegularCustomer از ان ارثبری کرده اند.
هر مشتری میتواند به سه نوع روش مبلغ مورد نظر خود را پرداخت بکند.

برای اجرای پروژه ابتدا مخزن آن را با دستور زیر کلون بکنید :
'''bash
git clone https://github.com/SanjiPk/payment-system.git
'''
سپس کد را با دستور javac کامپایل کرده و اجرا کنید :
'''bash
javac -d bin -sourcepath src src/Main.java
java -cp bin Main
'''
و یا از IDE مورد نظر خود برای اجرا استفاده بکنید.
