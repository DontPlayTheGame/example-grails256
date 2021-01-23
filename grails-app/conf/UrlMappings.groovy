class UrlMappings {

	static mappings = {

        "/inhabituel"(controller: "home") {
            lang = "fr"
        }

        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(controller: "home")
        "500"(view:'/error')
	}
}
