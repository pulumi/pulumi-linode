module github.com/pulumi/pulumi-linode/provider/v2

go 1.14

require (
	github.com/hashicorp/terraform-plugin-sdk v1.11.0
	github.com/linode/terraform-provider-linode v1.11.0
	github.com/pulumi/pulumi-terraform-bridge/v2 v2.13.2
	github.com/pulumi/pulumi/sdk/v2 v2.13.3-0.20201109230029-a6f8b9b205cd
	github.com/satori/go.uuid v1.2.0 // indirect
)

replace (
	github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
	github.com/linode/terraform-provider-linode => github.com/pulumi/terraform-provider-linode v1.11.2-0.20201117163609-97f2908de93e
)
