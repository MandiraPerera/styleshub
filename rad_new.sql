-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 10, 2024 at 04:13 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `rad_new`
--

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE `category` (
  `category_id` int(11) NOT NULL,
  `category_name` varchar(255) NOT NULL,
  `category_description` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `category`
--

INSERT INTO `category` (`category_id`, `category_name`, `category_description`) VALUES
(5, 'Sports', 'Sporting goods and equipment'),
(29, 'T-Shirt', NULL),
(30, 'Watches', NULL),
(89, 'Caps', NULL),
(90, 'Hoodies ', NULL),
(91, 'Trousers', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

CREATE TABLE `orders` (
  `order_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `email` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `contact_number` varchar(20) NOT NULL,
  `address` text NOT NULL,
  `city` varchar(100) NOT NULL,
  `district` varchar(100) NOT NULL,
  `shipping_code` varchar(20) NOT NULL,
  `shipping_method` varchar(20) NOT NULL,
  `discounted_price` decimal(10,2) NOT NULL,
  `order_date` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `orders`
--

INSERT INTO `orders` (`order_id`, `user_id`, `email`, `name`, `contact_number`, `address`, `city`, `district`, `shipping_code`, `shipping_method`, `discounted_price`, `order_date`) VALUES
(5, 13, 'ashen@gmail.com', 'Ashen', '0701811860', 'Badulla', 'fghjk', 'jAISAS', 'fghjkl', 'speedPost', 9039.36, '2024-08-10 11:24:03'),
(8, 13, 'ashen@gmail.com', 'Ashen', '0701811860', 'Badulla', 'Badulla', 'Badulla', '90000', 'speedPost', 637536.00, '2024-08-10 14:11:54');

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `productid` int(11) NOT NULL,
  `productname` varchar(255) NOT NULL,
  `productdetails` text DEFAULT NULL,
  `productpic` varchar(255) DEFAULT NULL,
  `productprice` decimal(10,2) NOT NULL,
  `productdiscount` decimal(5,2) DEFAULT NULL,
  `productquantity` int(11) NOT NULL,
  `categoryid` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`productid`, `productname`, `productdetails`, `productpic`, `productprice`, `productdiscount`, `productquantity`, `categoryid`) VALUES
(36, 'Gildan Ultra Cotto T-shirt', 'Product : Blaze Orange Mens Crew Neck T-Shirt\r\nBrand : BEAST\r\nStyle : Casual Plain T Shirts\r\nColour : Blaze Orange\r\nMaterial : 65/35 Cotton. Softened\r\nThickness : 180 GSM\r\nSize Range : XS  XXL\r\nQuality Standards : 100% QC Passed. Export Ready.\r\nSpecialities : Tagless. Comfortable. Excellent Colorfastness. Anti-Shrink. \r\nWarranty : 14 Day Easy Returns & Size Exchanges. Return & Exchange Policy\r\nDelivery : Estimated 1-3 Working Days within Colombo & Suburbs. 3-5 Working Days Outstation.\r\nPayment Options : Card or Cash on Delivery at Checkout.\r\nA Genuine Product. Made in Sri Lanka.', 'https://th.bing.com/th/id/OIP.jEtsdRSdPqrF1GJRIIUmAgAAAA?rs=1&pid=ImgDetMain.jpeg', 2300.00, 12.00, 30, 29),
(37, 'Neon Green Sports T Shirt', 'Product : Neon Green Mens Sports T-Shirt\r\nBrand : OXYGEN SPORTS\r\nStyle : Crew Neck  Short Sleeve\r\nColour : Neon Green\r\nMaterial : Dri-Fit  95% Polyester Microfiber, 5% Spandex\r\nThickness : 150  160 GSM\r\nSize Range : XS  XXL\r\nQuality Standards : 100% QC Passed. Export Ready.\r\nSpecialities : Lightweight, Moisture-Wicking, Wrinkle Free, Anti-Shrink, Quick-Dry Performance. \r\nWarranty : 14 Day Easy Returns & Size Exchanges. Return & Exchange Policy\r\nDelivery : Estimated 1-3 Working Days within Colombo & Suburbs. 3-5 Working Days Outstation.\r\nPayment Options : Card or Cash on Delivery at Checkout.', 'https://th.bing.com/th/id/R.6c3ddd4f609acc5e3fff3e13255cfc15?rik=nMtuon3w6BIpiw&riu=http%3a%2f%2finikweb.com%2fwp-content%2fuploads%2f2015%2f02%2ft473kellygreen.jpg&ehk=ngEG5J4NY4mngHySwtGScfJOpm%2bFsWS9P0TPNj15Qww%3d&risl=&pid=ImgRaw&r=0.jpeg', 1900.00, 5.00, 30, 29),
(38, 'White-Polo T-Shirt', 'product : Neon Green Mens Sports T-Shirt\r\nBrand : OXYGEN SPORTS\r\nStyle : Crew Neck  Short Sleeve\r\nColour : Neon Green\r\nMaterial : Dri-Fit  95% Polyester Microfiber, 5% Spandex\r\nThickness : 150  160 GSM\r\nSize Range : XS  XXL\r\nQuality Standards : 100% QC Passed. Export Ready.', 'https://theshoppies.pk/wp-content/uploads/2020/06/Create-T-Shirt-1.jpg', 1900.00, 2.00, 56, 29),
(39, 'Custom Unisex Gildan Adult T-shirt', 'Custom Unisex Gildan Adult T-shirt', 'https://th.bing.com/th/id/OIP.U6nypwIrPc6kgUXB2KG5ewHaIg?rs=1&pid=ImgDetMain.jpeg', 1900.00, 12.00, 12, 29),
(40, 'Gildan Ultra Cotton T-Shirt Plain/Blank', 'Gildan Ultra Cotton T-Shirt Plain/Blank', 'https://th.bing.com/th/id/OIP.wOCX8Gc3gPyLs7s-FzyrTwAAAA?rs=1&pid=ImgDetMain.jpeg', 3500.00, 12.00, 56, 29),
(42, 'Buy Black T-Shirt - 100% Cotton Plain T-Shirt', 'Buy Black T-Shirt - 100% Cotton Plain T-Shirt', 'https://www.filmyvastra.com/wp-content/uploads/2019/06/Black-Wide-tshirt-without-hanger-Recovered-scaled.jpg', 3200.00, 12.00, 21, 29),
(43, 'Black T-Shirt with THE THE Logo | Full Clothing', 'Black T-Shirt with THE THE Logo | Full Clothing', 'https://i.pinimg.com/originals/18/c3/16/18c3165d436e3e72f0f8ffc892c2a73e.jpg', 1900.00, 5.00, 54, 29),
(44, 'Basic T-Shirt - Kids - Desamind', 'Basic T-Shirt - Kids - Desamind', 'https://desamind.id/wp-content/uploads/2023/01/short-shirt.jpg', 2600.00, 12.00, 12, 29),
(45, 'Buy Chuck Taylor All Star Hi Top Shoe', 'Buy Chuck Taylor All Star Hi Top Shoe', 'https://th.bing.com/th/id/OIP.9nzBhAxiLlNG3asvhoGwzgHaJQ?rs=1&pid=ImgDetMain.jpeg', 6500.00, 5.00, 21, 5),
(46, 'Chrome SPD shoe for the everyday commuter', 'Chrome SPD shoe for the everyday commuter', 'https://www.bicycleretailer.com/sites/default/files/images/article/TrukPro_Grey_HeroUp.jpg', 5600.00, 12.00, 12, 5),
(48, 'adidas Runfalcon 3.0 Shoes - Black | adidas Deutschland', 'adidas Runfalcon 3.0 Shoes - Black | adidas Deutschland', 'https://assets.adidas.com/images/w_600,f_auto,q_auto/f9d52817f7524d3fb442af3b01717dfa_9366/Runfalcon_3.0_Shoes_Black_HQ3790_01_standard.jpg', 9800.00, 2.00, 212, 5),
(49, 'Men\'s New Balance® 602 Athletic Shoes, White / Navy', 'Men\'s New Balance® 602 Athletic Shoes, White / Navy', 'https://th.bing.com/th/id/OIP.P002dynaWZMy8Ak-p4aiBgHaHa?rs=1&pid=ImgDetMain.jpeg', 16000.00, 12.00, 32, 5),
(50, 'Women\'s Turntec® Athletic Shoes, White', 'Women\'s Turntec® Athletic Shoes, White', 'https://th.bing.com/th/id/OIP.vhKQFHiAHFHFBSoHQuWAoAHaHa?rs=1&pid=ImgDetMain.jpeg', 12000.00, 21.00, 12, 5),
(51, 'Sport Shoes  Best Shoes to Wear during Outdoor', 'Sport Shoes  Best Shoes to Wear during Outdoor', 'https://balistarisland.com/wp-content/uploads/2016/03/sportshoes.jpeg', 6500.00, 2.00, 12, 5),
(52, 'Elegant Jorg Gray Men\'s White Watch', 'Elegant Jorg Gray Men\'s White Watch', 'https://i.pinimg.com/originals/fd/d9/b0/fdd9b05df49ec10f6475e07c95f4ce2b.jpg', 35000.00, 2.00, 6, 30),
(53, 'DIESEL Synthetic Dz4521 Griffed Chronograph White Watch', 'DIESEL Synthetic Dz4521 Griffed Chronograph White Watch', 'https://cdnc.lystit.com/photos/diesel/b837d3fc/diesel-White-Dz4521-Griffed-Chronograph-White-Watch.jpeg', 35000.00, 4.00, 6, 30),
(54, 'Oniss Paris - Oniss Men\'s Bold GT 52mm White Silicone', 'Oniss Paris - Oniss Men\'s Bold GT 52mm White Silicone', 'https://i5.walmartimages.com/asr/6a013a5c-9ff1-4817-ba1d-16a4b3c5e749_1.48d767ab9ebe51a2314b9e9be1dce7a0.jpeg', 21000.00, 5.00, 45, 30),
(55, 'Luxury Watch Isolated on White Background Editorial Image', 'Luxury Watch Isolated on White Background Editorial Image', 'https://thumbs.dreamstime.com/b/luxury-watch-isolated-white-background-luxury-watch-isolated-white-background-men-women-wrist-watch-201492930.jpg', 650000.00, 3.00, 2, 30),
(56, 'Buy Ben Sherman Mens White Dial Watch Multi', 'Buy Ben Sherman Mens White Dial Watch Multi', 'https://resources.mandmdirect.com/Images/_default/b/s/3/bs30854_2_cloudzoom.jpg', 12000.00, 2.00, 121, 30),
(76, 'New Era Curved Brim 9FORTY Essential New York Yankees MLB Red ...', 'New Era Curved Brim 9FORTY Essential New York Yankees MLB Red ...', 'https://caphunters.co.uk/13422-large_default/new-era-curved-brim-9forty-essential-new-york-yankees-mlb-red-adjustable-cap.jpg', 1900.00, 2.00, 23, 89),
(77, '  NEW ERA NEW YORK YANKEES ESSENTIAL LOGO ', '\r\n  NEW ERA NEW YORK YANKEES ESSENTIAL LOGO ', 'https://prod.aaw.com/media/catalog/product/4/3/43d16a70f3216334800249865b1664838d935c22744e4e14b368ff4a74625a90.jpeg', 2900.00, 12.00, 1, 89),
(79, 'Fitted Baseball Cap-Baseball Cap Custom', 'Fitted Baseball Cap-Baseball Cap Custom', 'https://www.textileeurope.com/files/202101/src/xl/a7118cf5ff27b63084de2b50c6bab736.jpg', 2000.00, 2.00, 5, 89),
(80, 'Fashion Plain Face Cap For Men And Women- White I Jumia Nigeria', 'Fashion Plain Face Cap For Men And Women- White I Jumia\r\nNigeria', 'https://ng.jumia.is/unsafe/fit-in/500x500/filters:fill(white)/product/57/3781852/1.jpg?4979.jpg', 3500.00, 5.00, 10, 89),
(81, 'Royal Navy Baseball Caps Snapbacks', 'Royal Navy Baseball Caps Snapbacks', 'https://images-na.ssl-images-amazon.com/images/I/61c3KuPRsNL._AC_UX569_.jpg', 2500.00, 3.00, 10, 89),
(83, 'Royal Navy Retired Cap â British Military Humour', 'Royal Navy Retired Cap â British Military Humour', 'https://www.britishmilitaryhumour.co.uk/wp-content/uploads/2019/02/BMH1043CAPGREY.jpg', 4000.00, 10.00, 10, 89),
(84, 'U.S. Navy Retired Embroidered USA Flag Hat', 'U.S. Navy Retired Embroidered USA Flag Hat', 'https://cdn11.bigcommerce.com/s-yxqcm6k9o4/images/stencil/2560w/products/12319/22449/OD_HAT_RETIRED_NAVY_front_2000x2000__55285.1663774053.jpg', 2500.00, 5.00, 5, 89),
(85, 'SLISL EIEI Navy US Submarine Force Retired Adjustable Baseball Caps', 'SLISL EIEI Navy US Submarine Force Retired Adjustable\r\nBaseball Cap', 'https://m.media-amazon.com/images/I/71Gz+6Hxj1L._AC_UX679_.jpg', 3000.00, 10.00, 20, 89),
(86, 'Decky Relaxed Soft Low Crown Dad Washed Cotton Polo Vintage 6 Panel cap', 'Decky Relaxed Soft Low Crown Dad Washed Cotton Polo Vintage 6 Panel cap', 'https://servetheflag.com/cdn/shop/products/decky-relaxed-soft-low-crown-dad-washed-cotton-polo-vintage-6-panel-caps-hats-hats-decky-205-black-48_1024x.jpg', 4000.00, 5.00, 10, 89),
(87, 'Nike Men Running Shoes ( Grey ) for Men - Buy Nike Men\'s Sport Shoe', 'Nike Men Running Shoes ( Grey ) for Men - Buy Nike Men\'s Sport Shoe', 'https://th.bing.com/th/id/OIP.49ABKChg8dXjAoX29S1_nAAAAA?rs=1&pid=ImgDetMain.jpg', 15000.00, 10.00, 10, 5),
(88, 'Nike REVOLUTION Men\'s Running Shoes Sneakers', 'Nike REVOLUTION Men\'s Running Shoes Sneakers', 'https://th.bing.com/th/id/OIP.9oyCxpvTz7qRXXl6F4Nc9QHaHa?rs=1&pid=ImgDetMain.jpg', 20000.00, 5.00, 5, 5),
(90, 'WeWood Alpha Swiss Rough Indian Rosewood Watch Chocolate', 'WeWood Alpha Swiss Rough Indian Rosewood Watch Chocolate', 'https://cdn.shopify.com/s/files/1/0230/0765/products/70361511000-ALPHA_SW_CHOCO_ROUGH-01.jpg', 5000.00, 10.00, 10, 30),
(91, 'Ruy_AppIe Watch Hermes - Apple(HK)', 'Ruy_AppIe Watch Hermes - Apple(HK)', 'https://store.storeimages.cdn-apple.com/8756/as-images.apple.com/is/watch-compare-ultra-202209_GEO_HK?wid=520&hei=616&fmt=jpeg', 80000.00, 5.00, 20, 30),
(92, 'Apple Watch Clone AAA Grade-Dubai Clone', 'Apple Watch Clone AAA Grade-Dubai Clone', 'https://m.media-amazon.com/images/I/71Kd9SWuXmL._AC_SL1500_.jpg', 15000.00, 7.00, 30, 30),
(93, 'Compatible Apple Watch 44mm/42mm,Enamel Process Stainless', 'Compatible Apple Watch 44mm/42mm,Enamel Process Stainless', 'https://i5.walmartimages.com/asr/077ed767-4fd7-4cfe-8f66-72288e06e389.94e18c272997e78c09910bf12e85f7ac.jpeg', 65000.00, 10.00, 30, 30),
(94, 'MJA logo Tee â Money Junkies Apparel XL', 'MJA logo Tee â Money Junkies Apparel XL', 'https://cdn.shopify.com/s/files/1/1404/4231/products/image_1bc3728f-1826-453c-9680-63f1aa0737ec_1800x1800.png.jpg', 3000.00, 5.00, 50, 29),
(95, 'Shoppersmart Unisex Plain RED Hoodie/Plain Red Hoodie', 'Shoppersmart Unisex Plain RED Hoodie/Plain Red Hoodie', 'https://images-na.ssl-images-amazon.com/images/I/51dIPdGycPL._AC_SL1000_.jpg', 6000.00, 15.00, 20, 90),
(97, 'Markpedia - China Africa (Men)', 'Markpedia - China Africa (Men)', 'https://markpedia-store.s3.amazonaws.com/static/marketplaceproducts/temp_OfoWCPb.jpeg', 5000.00, 5.00, 10, 90),
(98, 'SHEIN EZwear Kangaroo Pocket Thermal Lined Drawstring Thermal Lined', 'SHEIN EZwear Kangaroo Pocket Thermal Lined Drawstring Thermal Lined', 'https://i.pinimg.com/736x/3f/70/df/3f70df3b72b34008296f182e514392c9.jpg', 8000.00, 10.00, 20, 90),
(99, ' 2021 Streetwear Graphic Fleece Hoodie In PURPLE I ZAFUL', ' 2021 Streetwear Graphic Fleece Hoodie In PURPLE I ZAFUL', 'https://gloimg.zafcdn.com/zaful/pdm-product-pic/Clothing/2018/10/13/goods-first-img/1539545644162298815.jpg', 10000.00, 10.00, 20, 90),
(100, 'Love Yourself Euphoria Hoodie I Wom By Bangtan Boys', 'Love Yourself Euphoria Hoodie I Wom By Bangtan Boys', 'https://i.pinimg.com/736x/40/03/4c/40034c8e4cbfba2031fe4912edf5a50d.jpg', 7000.00, 5.00, 10, 90),
(101, 'Street style fashion 20 cool hoodie outfits for men to try in 2024', 'Street style fashion 20 cool hoodie outfits for men to try in 2024', 'https://i.pinimg.com/originals/9f/6a/62/9f6a628620960ae8b7cb97ba1b4537ea.jpg', 10000.00, 9.00, 10, 90),
(102, 'Kangaroo Pocket Color Spliced Hoodie - Gray Cloud', 'Kangaroo Pocket Color Spliced Hoodie - Gray Cloud', 'https://th.bing.com/th/id/OIP.u7zzRA33Ur0HWYlIzYzklgHaJ2?rs=1&pid=ImgDetMain.jpg', 5000.00, 5.00, 10, 90),
(103, 'New Men Hoodies Manufacturers Contrast Sleeve Drawstring Three Color', 'New Men Hoodies Manufacturers Contrast Sleeve Drawstring\r\nThree Color', 'https://i.pinimg.com/736x/3f/87/13/3f8713977042b9748794ac3e6ac8dd3a.jpg', 10000.00, 10.00, 20, 90),
(104, 'Gildan Ultra Blend Hooded Sweatshirt - Company Clothing', 'Gildan Ultra Blend Hooded Sweatshirt - Company Clothing', 'https://www.ezcorporateclothing.com/cdn/shop/files/g125-ash.jpg', 8000.00, 10.00, 25, 90),
(105, 'Male trousers latest - Cotton & Polyester', 'Male trousers latest - Cotton & Polyester-Improted from China', 'https://m.media-amazon.com/images/I/51lFePO2RML._AC_UF1000,1000_QL80_.jpg', 4000.00, 5.00, 25, 91),
(106, 'Men Pants Side Pockets Color Button Solid Casual Trousers', 'Men Pants Side Pockets Color Button Solid Casual Trousers', 'https://m.media-amazon.com/images/I/516MortBhGL._AC_UX569_.jpg', 3500.00, 10.00, 25, 91),
(107, 'Cuts 5-pocket pant for men 36\'', 'Cuts 5-pocket pant for men 36\'', 'https://i.ebayimg.com/images/g/sLUAAOSwGwdmtce1/s-l500.jpg', 5000.00, 10.00, 10, 91),
(108, 'Coaxsher Tyee Dual Compliant Fire Pant - Navy â SeaWestem', 'Coaxsher Tyee Dual Compliant Fire Pant - Navy â SeaWestem', 'https://seawestern.com/cdn/shop/files/FCNV214-4T_501x501.jpg', 5000.00, 5.00, 10, 91),
(109, 'Men\'s 5.11 Taclite Pro Pants I Tactical Gear Superstore I TacticalGear.com', 'Men\'s 5.11 Taclite Pro Pants I Tactical Gear Superstore I\r\nTacticalGear.com', 'https://defenseequipmentcompany.com/wp-content/uploads/2020/04/GenIIPant_TacticalPocket_1800x1800.jpg', 6000.00, 10.00, 15, 91),
(110, 'Marmot Motion Insulated Pant - Men\'s I Backcountry.com', 'Marmot Motion Insulated Pant - Men\'s I Backcountry.com', 'https://content.backcountry.com/images/items/900/MAR/MAR1814/DARSAP.jpg', 6000.00, 5.00, 15, 91),
(111, 'Work Pants Men Cargo Pants for Men Straight Pocket', 'Work Pants Men Cargo Pants for Men Straight Pocket', 'https://th.bing.com/th?id=OIF.6czpYufJh0JDwL%2fkvueduw&rs=1&pid=ImgDetMain.jpg', 5000.00, 5.00, 25, 91),
(112, 'Men\'s Elastic Insert Work Pant I Work Hard Dress Right', 'Men\'s Elastic Insert Work Pant I Work Hard Dress Right', 'https://th.bing.com/th/id/OIF.vIK2byaskxhBs4qHW521zw?rs=1&pid=ImgDetMain.jpg', 6000.00, 10.00, 20, 91),
(113, 'J Lindeberg Elof Light Poly Regular Fit Pant I Trousers I J.Lindeberg', 'J Lindeberg Elof Light Poly Regular Fit Pant I Trousers I\r\nJ.Lindeberg', 'https://cdn.allsquaregolf.com/pictures/pictures/000/182/997/large/picture_product_undefined.jpg', 8000.00, 10.00, 20, 91),
(114, 'World Balance White Shoes Men', 'World Balance White Shoes Men 44\'', 'https://th.bing.com/th/id/R.3f4d367729da599332f0093ea786a206?rik=ZdeM42QhkPe9Lg&riu=http%3a%2f%2fimage.sportsmansguide.com%2fadimgs%2fl%2f1%2f125540_ts.jpg&ehk=XMZP1%2buKXT2muHWpuCSAQR0aCh0x6G6Nuq9v2RXboK4%3d&risl=&pid=ImgRaw&r=0.jpg', 20000.00, 10.00, 20, 5);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `username` varchar(255) NOT NULL,
  `useremail` varchar(255) NOT NULL,
  `userpassword` varchar(255) NOT NULL,
  `userphonenumber` varchar(15) NOT NULL,
  `useraddress` text NOT NULL,
  `usertype` enum('admin','normal') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `username`, `useremail`, `userpassword`, `userphonenumber`, `useraddress`, `usertype`) VALUES
(1, 'ravindu', 'ravindu@email.com', '1234', '0701418312', '5555', 'admin'),
(2, 'disal', 'disal@gmai.com', '1234', '0701418312', 'disal', 'normal'),
(3, 'chamod', 'chamod@gmail.com', 'chamod', '0701418312', 'chamod', 'normal'),
(9, 'sammani', 'sammani@gmail.com', '1234', '054564165', 'jasjdaljskdnajksdjkasndad', 'normal'),
(10, 'lahiru', 'lahiru@gmail.com', '1234', '526546564', 'sdkhhuasjndahsjidasd', 'normal'),
(11, 'dare', 'dare@gmail.com', '1234', '04589456499', '4aksdoijansjdnasd', 'normal'),
(12, 'modaya', 'modaya@gmail.com', '1234', '0114567892', 'anjsiodjasdkalsdjkasd', 'normal'),
(13, 'Ashen', 'ashen@gmail.com', '1234', '0701811860', 'Badulla', 'normal'),
(14, 'nipuni', 'nipuni@gmail.com', '1234', '234567890', 'ghjk', 'normal'),
(15, 'awishka', 'awishaka@gmail.com', '1234', '234567890', 'ansjdnajsdna', 'normal'),
(16, 'nipuni', 'n@gmail.com', '1234', '078172821', 'gshdjk', 'normal'),
(17, 'chanuki', 'chanuki@gmail.com', '1234', '817238173182', 'asjdjasdjk', 'normal'),
(18, 'hasun', 'hasun@gmail.com', '1234', '34567890', 'vbnm,lkjhg', 'normal'),
(19, 'kashmila', 'kashmila@gmail.com', '1234', '123456789', 'sajnsdkf', 'normal'),
(20, 'mandira', 'mandira@gmail.com', '1234', '23456', 'rtyu', 'normal');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`category_id`);

--
-- Indexes for table `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`order_id`),
  ADD KEY `user_id` (`user_id`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`productid`),
  ADD KEY `categoryid` (`categoryid`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `category`
--
ALTER TABLE `category`
  MODIFY `category_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=92;

--
-- AUTO_INCREMENT for table `orders`
--
ALTER TABLE `orders`
  MODIFY `order_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `product`
--
ALTER TABLE `product`
  MODIFY `productid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=115;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `orders`
--
ALTER TABLE `orders`
  ADD CONSTRAINT `orders_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`);

--
-- Constraints for table `product`
--
ALTER TABLE `product`
  ADD CONSTRAINT `product_ibfk_1` FOREIGN KEY (`categoryid`) REFERENCES `category` (`category_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
