const a = 1988;
let products = [
        {
          id: 1,
          url: "https://www.thegioididong.com/dtdd/iphone-14-pro-max",
          product_name: "Iphone 13 Pro Max",
          ram: "6GB",
          price: "27.790.000",
          product_thumb:
            "https://cdn.tgdd.vn/Products/Images/42/251192/iphone-14-pro-max-vang-thumb-600x600.jpg",
        },
        {
          id: 2,
          url: "https://www.thegioididong.com/dtdd/iphone-11#2-gia",
          product_name: "Iphone 14 Pro Max",
          ram: "6GB",
          price: "29.990.000",
          product_thumb:
            "https://cdn.tgdd.vn/Products/Images/42/153856/iphone-11-trang-600x600.jpg",
        },
      ];

 function show(){
    console.log('Hiển thị danh sách sản phẩm')
 }  
 class Products{
    constructor(){

    }

    render(){
        console.log('Xuất danh sách sản phẩm lên giao diện')
    }
 }
 
export {Products as default, a, products, show}