module github.com/pulumi/pulumi-linode/provider/v3

go 1.16

require (
	github.com/hashicorp/terraform-plugin-sdk v1.11.0 // indirect
	github.com/linode/terraform-provider-linode v1.11.0
	github.com/pulumi/pulumi-terraform-bridge/v3 v3.0.0-beta.1
	github.com/pulumi/pulumi/sdk/v3 v3.0.0-beta.2
)

replace (
	github.com/hashicorp/terraform-plugin-sdk/v2 => github.com/pulumi/terraform-plugin-sdk/v2 v2.0.0-20201218231525-9cca98608a5e
	github.com/linode/terraform-provider-linode => github.com/pulumi/terraform-provider-linode v1.11.2-0.20210418193720-b8b908be3c6b
)
