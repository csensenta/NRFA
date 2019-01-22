package cha

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
        "/aboutus"(controller:'aboutus',action:'aboutus')
        "/dashboard"(controller: 'dashboard',action: 'index')
                
        group "/dashboard",{
            '/distributors'(controller:'dashboard',action:'distributorstable')
            '/cards'(controller:'dashboard',action:'cardstable')
            '/merchants'(controller:'dashboard',action:'merchantstable')
            '/transactions'(controller:'dashboard',action:'transactionstable')
        }
                
                
                
                

    }
}
