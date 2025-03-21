# پروژه ارث‌بری- اپلیکیشن تجاری

## مقدمه

در این پروژه می‌خواهیم یک اپلیکیشن تجاری ساده را پیاده‌سازی می‌کند، به طوری که در آن مشتریان مختلف می‌توانند با روش‌های مختلف پرداخت‌هایشان را انجام دهند.

## ویژگی‌های پروژه

* مدیریت روش‌های مختلف پرداخت
* انجام عملیات پرداخت
* ثبت اطلاعات روش پرداخت
* مدیریت اطلاعات مشتریان
* ثبت تاریخچه پرداخت مشتریان
* تست پروژه


## کلاس‌ها:

### اینترفیس PaymentStrategy

این اینترفیس روش‌های پرداخت را نشان می‌دهد. همچنین در این بخش اطلاعات مربوط به هر نوع پرداخت چاپ می‌شود.

#### زیرکلاس‌ها:

1. کلاس  CreditCardPayment
   
در این کلاس پرداخت با کارت اعتباری با توجه به شماره کارت و نام فرد نشان داده می‌شود.

2. کلاس PayPalPayment
   
در این کلاس پرداخت با پی‌پال با توجه به ایمیل فرد نشان داده می‌شود.

3. کلاس BitcoinPayment

 در این کلاس پرداخت با بیت‌کوین با توجه به آدرس کیف پول فرد نشان داده می‌شود.
 
### کلاس ابسترکت Customer 

این کلاس نشان‌دهنده مشتری‌ها می‌باشد. همچنین در این بخش با توجه به روش پرداخت انتخاب شده، پرداخت انجام و در تاریخچه پرداخت مشتری ذخیره می‌شود.

#### زیرکلاس‌ها:

1. کلاس RegularCustomer

این کلاس مشتری‌های معمولی را به‌همراه اطلاعات آن‌ها نمایش می‌دهد.

2. کلاس PremiumCustomer

این کلاس مشتری‌های پرمیوم را به‌همراه اطلاعات آن‌ها نمایش می‌دهد.

## نحوه اجرای برنامه

1. دانلود و اجرای پروژه
   
ابتدا کد را clone کرده و در یک محیط توسعه‌ی جاوا (مانند IntelliJ IDEA) باز کنید.

2. اجرای کلاس Main

کلاس Main را اجرا کنید. در این کلاس نمونه‌هایی از مشتریان و روش‌های پرداخت متفاوت ایجاد شده‌اند، اطلاعات هر مشتری چاپ، پرداخت‌هایشان انجام و تاریخچه پرداخت هرکدام نمایش داده می‌شود.


   
